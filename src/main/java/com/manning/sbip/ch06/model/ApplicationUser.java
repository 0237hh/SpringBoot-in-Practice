package com.manning.sbip.ch06.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "CT_USERS")
public class ApplicationUser {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
}
