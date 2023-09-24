package com.example.serverapi;

import java.util.List;

public interface ServerService {
    List<Server> getAllServers();
    Server getServerById(String id);
    Server saveServer(Server server);
    void deleteServer(String id);
    List<Server> findServersByName(String name);
}
