package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Data
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
    @ManyToOne
    @JoinColumn(name = "rate_comment_id")
    private RateComment rateComment;

    @ManyToOne
    @JoinColumn(name = "price_id")
    private Price price;
}
