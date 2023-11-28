package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String paymentType;
    private String creditCardNo;
    private Date paymentDate;
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
}
