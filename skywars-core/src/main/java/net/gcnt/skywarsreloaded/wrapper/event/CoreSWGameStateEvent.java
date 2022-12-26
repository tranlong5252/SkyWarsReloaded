package net.gcnt.skywarsreloaded.wrapper.event;

import net.gcnt.skywarsreloaded.event.SWEvent;
import net.gcnt.skywarsreloaded.game.gameinstance.GameInstance;
import net.gcnt.skywarsreloaded.game.gameinstance.LocalGameInstance;
import net.gcnt.skywarsreloaded.game.types.GameState;

public class CoreSWGameStateEvent implements SWEvent {

	private final GameInstance game;
	private final GameState state;

	public CoreSWGameStateEvent(GameInstance game, GameState state) {
		this.game = game;
		this.state = state;
	}

	public boolean isLocal() {
		return game instanceof LocalGameInstance;
	}

	public GameInstance getGame() {
		return game;
	}

	public GameState getState() {
		return state;
	}
}
