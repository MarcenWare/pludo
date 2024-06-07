package de.pludo.backend.player;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String username;

    private UUID game;

    @Enumerated(EnumType.STRING)
    private PlayerState state;
}
