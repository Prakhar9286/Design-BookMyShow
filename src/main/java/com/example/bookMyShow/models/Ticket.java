package com.example.bookMyShow.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import java.util.List;

@Entity
public class Ticket extends BaseModel {
    @ManyToOne
    private User user;
    @ManyToMany // Because cancellation is allowed so M:M
    private List<ShowSeat> seats;
    private Double amount;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

}
