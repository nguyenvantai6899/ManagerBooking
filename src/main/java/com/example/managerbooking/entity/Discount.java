package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="discount_type")
    private String discountType;
    private String code;
    private double value;
    @Column(name="start_date")
    private Date startDate;
    @Column(name="end_date")
    private Date endDate;
    @Column(name="condition_discount")
    private String conditionDiscount;

}
