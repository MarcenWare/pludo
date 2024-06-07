package de.pludo.backend.lobby.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class CreateLobbyRequest {
    private UUID playerId;
}
