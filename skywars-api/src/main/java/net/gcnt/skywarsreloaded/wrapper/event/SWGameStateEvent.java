package net.gcnt.skywarsreloaded.wrapper.event;

import net.gcnt.skywarsreloaded.event.SWEvent;
import net.gcnt.skywarsreloaded.game.gameinstance.GameInstance;
import net.gcnt.skywarsreloaded.game.types.GameState;

public interface SWGameStateEvent extends SWEvent {

    boolean isLocal();

    GameInstance getGame();

    GameState getState();
}
