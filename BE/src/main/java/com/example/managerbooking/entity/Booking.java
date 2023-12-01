package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "checkin_date")
    private Date checkinDate;
    @Column(name = "checkout_date")
    private Date checkoutDate;
    @Column(name = "total_price")
    private double totalPrice;
    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;
    @ManyToOne
    @JoinColumn (name = "discount_id")
    private Discount discount;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
