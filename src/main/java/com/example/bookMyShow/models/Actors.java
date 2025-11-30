package com.example.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Actors extends BaseModel {
    private String name;
    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;

}
