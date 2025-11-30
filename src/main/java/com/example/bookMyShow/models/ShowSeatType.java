package com.example.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

@Entity
public class ShowSeatType extends BaseModel {
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TypeOfSeat typeOfSeat;
    private Double price;
}
