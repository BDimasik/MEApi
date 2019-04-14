package com.mineexperts.api.multiserver;

import java.util.Collection;

public interface ServersManager {

	Server getServer(String key);
	
	Collection<Server> getServers();
}