package com.mineexperts.api;

import com.mineexperts.api.multiserver.ServersManager;
import com.mineexperts.api.world.creatures.CreatureManager;

public final class MineExperts {
	
	private static ServersManager serversManager;
	private static CreatureManager creatureManager;
	
	public static ServersManager getServersManager() {
		return serversManager;
	}
	
	public static CreatureManager getCreatureManager() {
		return creatureManager;
	}
}