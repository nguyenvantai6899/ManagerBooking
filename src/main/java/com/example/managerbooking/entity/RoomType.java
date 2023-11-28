package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "room_type")
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String capacity;
}
