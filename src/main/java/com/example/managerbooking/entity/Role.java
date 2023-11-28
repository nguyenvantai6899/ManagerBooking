package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String role;
}
