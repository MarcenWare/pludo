package de.pludo.backend.lobby.internal;

import de.pludo.backend.lobby.LobbyService;
import de.pludo.backend.lobby.dto.CreateLobbyRequest;
import de.pludo.backend.lobby.dto.CreateLobbyResponse;
import de.pludo.backend.lobby.dto.JoinLobbyRequest;
import de.pludo.backend.lobby.dto.JoinLobbyResponse;
import org.springframework.stereotype.Service;

@Service
public class LobbyServiceImpl implements LobbyService {
    @Override
    public CreateLobbyResponse create(CreateLobbyRequest dto) {
        return null;
    }

    @Override
    public JoinLobbyResponse join(JoinLobbyRequest dto) {
        return null;
    }
}
