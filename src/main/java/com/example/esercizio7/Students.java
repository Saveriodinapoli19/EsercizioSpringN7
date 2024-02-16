package com.example.esercizio7;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
    public class Students {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idStudents;
        @Column(nullable = false, name = "Nome Studente")
        private String firstName;
        @Column(nullable = false, name = "Cogmome Studente")
        private String lastName;
        @Column(unique = true, nullable = false, name = "Indirizzo email")
        private String email;

    }

