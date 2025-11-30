package com.example.bookMyShow.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Auditorium auditorium;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ShowFeatures> showFeatures;
    @Enumerated(EnumType.STRING)
    private Language language;
    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeat;
    @OneToMany(mappedBy = "show")
    private List<ShowSeatType> showSeatType;
}
