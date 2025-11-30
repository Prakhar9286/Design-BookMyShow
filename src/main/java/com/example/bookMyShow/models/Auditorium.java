package com.example.bookMyShow.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Auditorium extends BaseModel {
    @OneToMany
    private List<Seat> seats;
    private String name;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeatures> auditoriumFeatures;
    private int capacity;
    @ManyToOne
    private Theatre theatre;

}
