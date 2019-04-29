package com.mineexperts.api.hologram;

import java.util.List;

import org.bukkit.Location;

public interface Hologram {

	Hologram addLine(String text);
	
	Hologram setLine(int index, String text);
	
	Hologram removeLine(String text);
	
	Hologram removeLine(int index);
	
	List<String> getLines();
	
	int size();
	
	void spawn(Location location);
	
	void despawn();
}