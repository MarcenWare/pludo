package de.pludo.backend.player;

import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachineFactory;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import java.util.EnumSet;

@Configuration
@EnableStateMachineFactory(name = "playerStateMachineFactory")
public class PlayerStateMachineConfig extends EnumStateMachineConfigurerAdapter<PlayerState, PlayerEvent> {

    @Override
    public void configure(StateMachineStateConfigurer<PlayerState, PlayerEvent> states)
            throws Exception {
        states
                .withStates()
                .initial(PlayerState.IDLE)
                .end(PlayerState.DISCONNECTED)
                .states(EnumSet.allOf(PlayerState.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<PlayerState, PlayerEvent> transitions)
            throws Exception {
//        transitions
//                .withExternal()
//                .source(PlayerState.IDLE)
//                .target(PlayerState.ROLL_DICE)
//                .event(PlayerEvent.ROLL_DICE)
//                .and()
//                .withExternal()
//                .source(PlayerState.ROLL_DICE)
//                .target(PlayerState.MOVE_PIECE)
//                .event(PlayerEvent.MOVE_PIECE)
//                .and()
                //.withExternal()
                //.source(PlayerState.MOVE_PIECE)
                //.target(PlayerState.WAITING)
                //.event(PlayerEvent.END_TURN)
                //.and()
//                .withExternal()
//                .source(PlayerState.WAITING)
//                .target(PlayerState.DISCONNECTED)
//                .event(PlayerEvent.DISCONNECT);
    }
}
