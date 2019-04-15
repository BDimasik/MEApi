package com.mineexperts.api.world.creatures;

import org.bukkit.Location;

import net.minecraft.server.v1_12_R1.EntityCreature;

public interface Creature {

	/**
	 * Returns a creature's name.
	 * @return creature's name.
	 */
	String getName();
	
	/**
	 * Sets a new name to the creature.
	 * @param name - a new name of creature.
	 */
	void setName(String name);
	
	/**
	 * Spawns a new creature in the specified location.
	 * @param location - location where the creature will be spawned.
	 * @param clazz - the net.minecraft.server type of creature.
	 * @return created creature instance.
	 */
	<T extends EntityCreature> T spawn(Location location, Class<T> clazz);
}