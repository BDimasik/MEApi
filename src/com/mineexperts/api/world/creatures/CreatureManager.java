package com.mineexperts.api.world.creatures;

import com.mineexperts.api.world.creatures.mobs.NPC;
import org.bukkit.Location;

public interface CreatureManager {
	
	/**
	 * Returns a new creature instance.
	 * @return new creature instance.
	 */
	Creature newCreature();

    /**
     * Returns a new NPC instance.
     * @return new NPC instance.
     */
    NPC newNPC(Location location, String name);
}