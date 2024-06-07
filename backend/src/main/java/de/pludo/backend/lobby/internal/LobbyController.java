package de.pludo.backend.lobby.internal;

import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class LobbyController {
    private final StateMachineFactory<LobbyState, LobbyEvent> factory;

    public LobbyController(StateMachineFactory<LobbyState, LobbyEvent> factory) {
        this.factory = factory;
    }

    public void joinLobby() {
        UUID lobbyId = UUID.randomUUID();
        StateMachine<LobbyState, LobbyEvent> sm = factory.getStateMachine(lobbyId);
        sm.start();
        sm.sendEvent(LobbyEvent.PLAYER_READY);
    }
}
