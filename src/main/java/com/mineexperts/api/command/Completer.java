package com.mineexperts.api.command;

import java.util.List;

import org.bukkit.command.CommandSender;

public interface Completer {

	List<String> complete(CommandSender sender, String[] params);
}