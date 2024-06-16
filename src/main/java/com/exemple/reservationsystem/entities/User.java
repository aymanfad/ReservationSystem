package com.exemple.reservationsystem.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Table(name = "\"user\"")
@Data @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private Role role;
    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private Collection<Reservation> reservations;

}
