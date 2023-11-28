package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.Set;

@Table
@Data
@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private double stars;
    @Column(name = "checkin_date")
    private Date checkinDate;
    @Column(name = "checkout_date")
    private Date checkoutDate;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
            name="hotel_services",
            joinColumns = {@JoinColumn(name="hotel_id")},
            inverseJoinColumns = {@JoinColumn(name="service_id")}
    )
    private Set<Service> hotelService;
}
