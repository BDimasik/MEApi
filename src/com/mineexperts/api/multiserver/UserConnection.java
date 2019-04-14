package com.mineexperts.api.multiserver;

public interface UserConnection {

	/**
	 * Returns the Internet Protocol address of current user connection.
	 * @return the IP-address of the connection.
	 */
	String getIpAddress();
	
	/**
	 * Returns the server of current user connection.
	 * @return the IP-address of the connection.
	 */
	Server getServer();
	
	/**
	 * Connects current user connection to the specified server.
	 * @param server the server to connect.
	 */
	void connect(Server server);
	
	/**
	 * Disconnects current user connection.
	 */
	void disconnect();
}