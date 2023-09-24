package com.example.serverapi;

import java.util.List;

public class ServerServiceImpl implements ServerService {

    private ServerRepository serverRepository;

    public ServerServiceImpl(ServerRepository serverRepository) {
        this.serverRepository = serverRepository;
    }

    @Override
    public List<Server> getAllServers() {
        return serverRepository.getAllServers();
    }

    @Override
    public Server getServerById(String id) {
        return serverRepository.getServerById(id);
    }

    @Override
    public Server saveServer(Server server) {
        return serverRepository.saveServer(server);
    }

    @Override
    public void deleteServer(String id) {
        serverRepository.deleteServer(id);
    }

    @Override
    public List<Server> findServersByName(String name) {
        return serverRepository.findServersByName(name);
    }
}
