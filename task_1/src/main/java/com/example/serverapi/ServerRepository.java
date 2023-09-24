package com.example.serverapi;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServerRepository extends MongoRepository<Server, String> {
    List<Server> findByNameContaining(String name);

    List<Server> getAllServers();

    Server getServerById(String id);

    Server saveServer(Server server);

    void deleteServer(String id);

    List<Server> findServersByName(String name);
}
