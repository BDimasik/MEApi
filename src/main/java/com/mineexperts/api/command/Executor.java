package com.mineexperts.api.command;

import org.bukkit.command.CommandSender;

public interface Executor {

	Result execute(CommandSender sender, String[] params);
}