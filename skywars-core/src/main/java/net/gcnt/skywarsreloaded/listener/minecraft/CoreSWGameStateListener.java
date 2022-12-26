package net.gcnt.skywarsreloaded.listener.minecraft;

import net.gcnt.skywarsreloaded.SkyWarsReloaded;
import net.gcnt.skywarsreloaded.listener.CoreSWEventListener;
import net.gcnt.skywarsreloaded.wrapper.event.CoreSWGameStateEvent;

public class CoreSWGameStateListener {

	private final SkyWarsReloaded plugin;

	public CoreSWGameStateListener(SkyWarsReloaded plugin) {
		this.plugin = plugin;
		plugin.getEventManager().registerListener(new CoreSWEventListener<>(CoreSWGameStateEvent.class, null));
	}
}
