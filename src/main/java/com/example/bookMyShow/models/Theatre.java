package com.example.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Theatre extends BaseModel {
    @OneToMany(mappedBy = "theatre")
    private List<Auditorium> auditoriums;
    private String address;
    @OneToMany
    private List<Show> upcomingShows;
    private String theatreName;
}
