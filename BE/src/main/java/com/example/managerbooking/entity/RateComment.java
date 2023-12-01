package com.example.managerbooking.entity;

import jakarta.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "rate_comments")
public class RateComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String comment;
    private double rate;
    private Date dateCreated;
}
