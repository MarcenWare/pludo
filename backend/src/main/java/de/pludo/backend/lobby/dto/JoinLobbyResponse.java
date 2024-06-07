package de.pludo.backend.lobby.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class JoinLobbyResponse {
    private LobbyResponse lobby;
}
