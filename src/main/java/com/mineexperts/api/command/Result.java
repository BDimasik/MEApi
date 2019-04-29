package com.mineexperts.api.command;

public final class Result {

	public static final Result DEFAULT_SUCCESS_RESULT = new Result(Type.SUCCESS);
	
	public enum Type {
		SUCCESS, ERROR, WRONG_USAGE, CONSOLE_ONLY, PLAYER_ONLY;
	}
	
	private final Type type;
	private final String details;
	
	public Result(Type type) {
		this(type, null);
	}
	
	public Result(Type type, String details) {
		this.type = type;
		this.details = details;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getDetails() {
		return details;
	}
}