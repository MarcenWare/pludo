package de.pludo.backend.lobby.internal;

import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachineFactory;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import java.util.EnumSet;

@Configuration
@EnableStateMachineFactory(name = "lobbyStateMachineFactory")
public class LobbyStateMachineConfig extends EnumStateMachineConfigurerAdapter<LobbyState, LobbyEvent> {

    @Override
    public void configure(StateMachineStateConfigurer<LobbyState, LobbyEvent> states)
            throws Exception {
        states
                .withStates()
                .initial(LobbyState.WAITING)
                .end(LobbyState.IN_GAME)
                .states(EnumSet.allOf(LobbyState.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<LobbyState, LobbyEvent> transitions)
            throws Exception {
        transitions
                .withExternal()
                .source(LobbyState.WAITING)
                .target(LobbyState.READY)
                .event(LobbyEvent.PLAYER_READY)
                .and()
                .withExternal()
                .source(LobbyState.READY)
                .target(LobbyState.IN_GAME)
                .event(LobbyEvent.START_GAME);
    }
}
