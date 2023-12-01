package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}

