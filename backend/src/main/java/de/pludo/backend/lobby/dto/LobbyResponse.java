package de.pludo.backend.lobby.dto;

import de.pludo.backend.api.dto.player.PlayerResponse;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Builder
@Getter
public class LobbyResponse {
    private UUID id;

    private String inviteCode;

    private boolean isPublic;

    private List<PlayerResponse> players;
}
