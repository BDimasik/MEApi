package com.mineexperts.api.mobs;

import net.minecraft.server.v1_12_R1.EntityMonster;
import org.bukkit.Location;

public interface Mob {
    /*
    Set mob name
    @param name - new mob name
     */
    Mob setName(String name);

    /*
    Create mob on location
    @param location - location, where the mob will spawn
    @param clazz - class of your mob

    @return created mob
     */

    <T extends EntityMonster> T spawn(Location location, Class<T> clazz);
}
