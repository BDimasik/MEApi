package com.mineexperts.api.command;

public interface CommandConstructor extends ElementConstructor<CommandConstructor, Command> {

	CommandConstructor addArgument(Argument argument);
	
	CommandConstructor next(int length);
	
	default CommandConstructor next() {
		return next(1);
	}
}