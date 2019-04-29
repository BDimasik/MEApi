package com.mineexperts.api.command;

public interface Element {

	String getGeneralName();
	
	String[] getAliases();
	
	Executor getExecutor();
	
	Completer getCompleter();
	
	String getUsage();
	
	String getPermission();
	
	String getPermissionMessage();
}