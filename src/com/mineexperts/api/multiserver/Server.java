package com.mineexperts.api.multiserver;

import java.util.Collection;

public interface Server {

	/**
	 * Returns the Internet Protocol address of current server.
	 * @return the IP-address of the server.
	 */
	String getIpAddress();
	
	/**
	 * Returns the name that is using to indicate this server in the server list.
	 * @return the name of the server.
	 */
	String getName();
	
	/**
	 * Returns the display name of this server.
	 * @return the display name of the server.
	 */
	String getDisplayName();
	
	/**
	 * Returns the lore (motd) of this server.
	 * @return the motd of the server.
	 */
	String getLore();
	
	/**
	 * Returns the state of this server.
	 * @return the state of the server.
	 */
	ServerState getServerState();
	
	/**
	 * Returns an immutable collection of {@code UserConnection} objects.
	 * @return an immutable collection of connections.
	 */
	Collection<UserConnection> getConnections();
}