package com.example.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User extends BaseModel {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
}
