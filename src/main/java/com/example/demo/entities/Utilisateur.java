package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Utilisateurs")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;

    @Column(nullable = false, length = 60)
    private String nomUtilisateur;

    @Column(nullable = false, length = 60)
    private String prenom;

    @Column(nullable = false, length = 60, unique = true)
    private String adresseEmail;

    @Column(nullable = false, length = 250)
    private String motDePasse;

    @Column(nullable = false, length = 60)
    private String role;

    public Utilisateur() {}
}
