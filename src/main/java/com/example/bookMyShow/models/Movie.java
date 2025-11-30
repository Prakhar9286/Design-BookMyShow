package com.example.bookMyShow.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Movie extends BaseModel {
    private String name;
    @ManyToMany
    private List<Actors> actors;
    private int duration;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Language> language;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeatures> movieFeatures;
}
