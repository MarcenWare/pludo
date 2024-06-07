package de.pludo.backend.lobby.internal;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Lobby {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private boolean isPublic;

    @ElementCollection
    private List<UUID> players;

    @Enumerated(EnumType.STRING)
    private LobbyState state;
}
