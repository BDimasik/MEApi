package com.mineexperts.api.command;

import org.bukkit.plugin.Plugin;

public interface CommandManager {

	Command newCommand(Plugin plugin, String... aliases);
	
	Command newCommand(String group, Plugin plugin, String... aliases);
	
	Argument newArgument(String... aliases);
}