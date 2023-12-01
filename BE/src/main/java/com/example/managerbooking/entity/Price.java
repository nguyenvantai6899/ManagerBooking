package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
}
