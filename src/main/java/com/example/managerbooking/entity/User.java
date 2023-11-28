package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Table
@Data
public class User {
    @Id
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @Column(name = "day_of_birth")
    private Date DOB;
    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
            name="user_role",
            joinColumns = {@JoinColumn(name="username")},
            inverseJoinColumns = {@JoinColumn(name="role_id")}
    )
    private Set<Role> userRole;
}
