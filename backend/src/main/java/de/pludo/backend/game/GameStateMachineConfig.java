package de.pludo.backend.game;

import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachineFactory;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;

@Configuration
@EnableStateMachineFactory
public class GameStateMachineConfig extends EnumStateMachineConfigurerAdapter<GameState, GameEvent> {
}
