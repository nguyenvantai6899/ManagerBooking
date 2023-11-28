package com.example.managerbooking.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Entity
@Table
@Data
public class User implements UserDetails {
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
    private boolean status;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
            name="user_role",
            joinColumns = {@JoinColumn(name="username")},
            inverseJoinColumns = {@JoinColumn(name="role_id")}
    )
    private Set<Role> userRole;
    public void setDOB(String dobString) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.DOB = dateFormat.parse(dobString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.userRole;
    }

    @Override
    public String getUsername() {
        return this.email;
    }
    @Override
    public String getPassword() {
        return this.password;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.status;
    }
}
