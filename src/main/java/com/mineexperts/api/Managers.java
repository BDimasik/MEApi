package com.mineexperts.api;

import com.mineexperts.api.command.CommandManager;
import com.mineexperts.api.entity.EntityManager;
import com.mineexperts.api.ui.UserInterfaceManager;

public final class Managers {

	private static CommandManager commandManager;
	private static EntityManager entityManager;
	private static UserInterfaceManager userInterfaceManager;
	
	public static CommandManager getCommandManager() {
		return commandManager;
	}
	
	public static EntityManager getEntityManager() {
		return entityManager;
	}
	
	public static UserInterfaceManager getUserInterfaceManager() {
		return userInterfaceManager;
	}
}