package de.pludo.backend.api;

import de.pludo.backend.lobby.LobbyService;
import de.ludo.backend.lobby.dto.*;
import de.pludo.backend.lobby.dto.CreateLobbyRequest;
import de.pludo.backend.lobby.dto.CreateLobbyResponse;
import de.pludo.backend.lobby.dto.JoinLobbyRequest;
import de.pludo.backend.lobby.dto.JoinLobbyResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class LobbyController {

    private final SimpMessagingTemplate smt;
    private final LobbyService lobbyService;

    @MessageMapping("/lobby/create")
    @SendToUser("/topic/lobby")
    public CreateLobbyResponse create(CreateLobbyRequest dto) {
        return lobbyService.create(dto);
    }

    @MessageMapping("/lobby/join")
    @SendToUser("/topic/lobby")
    public JoinLobbyResponse join(JoinLobbyRequest dto) {
        JoinLobbyResponse res = lobbyService.join(dto);
        smt.convertAndSend("/topic/lobby/" + res.getLobby().getId(), res);
        return res;
    }
}
