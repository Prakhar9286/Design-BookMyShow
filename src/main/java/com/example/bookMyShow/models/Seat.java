package com.example.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Seat extends BaseModel {
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private TypeOfSeat seatType;
}
