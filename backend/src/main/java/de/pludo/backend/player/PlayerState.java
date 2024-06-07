package de.pludo.backend.player;

public enum PlayerState {
    IN_LOBBY,
    IN_LOBBY_IDLE,
    IN_LOBBY_READY,

    IN_GAME,
    IN_GAME_WAITING,
    IN_GAME_HAS_TURN,

    DISCONNECTED
}
