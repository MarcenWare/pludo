package de.pludo.backend.game;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ElementCollection
    private List<UUID> players;

    @Enumerated(EnumType.STRING)
    private GameMode mode;

    @Enumerated(EnumType.STRING)
    private GameState state;
}
