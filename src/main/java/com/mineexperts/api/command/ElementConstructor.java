package com.mineexperts.api.command;

public interface ElementConstructor<T extends ElementConstructor<?, ?>, R> {

	T setExecutor(Executor executor);
	
	T setCompleter(Completer completer);
	
	T setUsage(String usageMessage);
	
	T setPermission(String permission);
	
	T setPermission(String permission, String message);
	
	R construct();
}