package com.BackEndProject.petshopbackend.Entity.UserEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    private String firstName;
    private String lastName;

    private String phone;
    private String address;

    private String role;


    private String email;
    private String password;

    private Date createdAt;


}
