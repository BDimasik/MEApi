package com.mineexperts.api.world.creatures;

import net.minecraft.server.v1_12_R1.EntityMonster;
import org.bukkit.Location;

public interface Creature {

    /**
     * Returns a creature's name.
     *
     * @return creature's name.
     */
    String getName();

    /**
     * Set stats for a creature
     *
     * @param damage - damage of the mob.
     * @param health - health of the mob.
     * @param speed - speed of the mob(range 0.0 -> 1.0).
     */
    void setStats(double damage, double health, double speed);

    /**
     * Sets a new name to the creature.
     *
     * @param name - a new name of creature.
     */
    void setName(String name);

    /**
     * Spawns a new creature in the specified location.
     *
     * @param location - location where the creature will be spawned.
     * @param clazz    - the net.minecraft.server type of creature.
     * @return created creature instance.
     */
    <T extends EntityMonster> T spawn(Location location, Class<T> clazz);
}