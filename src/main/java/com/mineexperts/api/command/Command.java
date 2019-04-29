package com.mineexperts.api.command;

import java.util.Collection;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;

public interface Command extends Element, CommandExecutor, TabCompleter {

	Collection<Argument> getArguments(int index);
	
	Command register();
}