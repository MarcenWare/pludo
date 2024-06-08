package de.pludo.backend.lobby.dto;

import lombok.*;

import java.util.UUID;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateLobbyRequest {
    private UUID playerId;
}
