package com.example.serverapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servers")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @GetMapping
    public List<Server> getAllServers() {
        return serverService.getAllServers();
    }

    @GetMapping("/{id}")
    public Server getServerById(@PathVariable String id) {
        return serverService.getServerById(id);
    }

    @PutMapping
    public Server saveServer(@RequestBody Server server) {
        return serverService.saveServer(server);
    }

    @DeleteMapping("/{id}")
    public void deleteServer(@PathVariable String id) {
        serverService.deleteServer(id);
    }

    @GetMapping("/find")
    public List<Server> findServersByName(@RequestParam String name) {
        return serverService.findServersByName(name);
    }
}
