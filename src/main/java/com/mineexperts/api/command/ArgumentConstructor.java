package com.mineexperts.api.command;

public interface ArgumentConstructor extends ElementConstructor<ArgumentConstructor, Argument> {

	ArgumentConstructor supportedPreviousArgs(String... args);
}