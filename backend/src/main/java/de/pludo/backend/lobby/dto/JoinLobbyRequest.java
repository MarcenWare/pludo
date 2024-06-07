package de.pludo.backend.lobby.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class JoinLobbyRequest {
    private String inviteCode;
    private UUID playerId;
}
