package de.pludo.backend.lobby;

import de.pludo.backend.lobby.dto.CreateLobbyRequest;
import de.pludo.backend.lobby.dto.CreateLobbyResponse;
import de.pludo.backend.lobby.dto.JoinLobbyRequest;
import de.pludo.backend.lobby.dto.JoinLobbyResponse;

public interface LobbyService {
    CreateLobbyResponse create(CreateLobbyRequest dto);
    JoinLobbyResponse join(JoinLobbyRequest dto);
}
