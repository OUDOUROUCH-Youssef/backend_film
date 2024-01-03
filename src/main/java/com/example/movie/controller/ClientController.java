package com.example.movie.controller;

import com.example.movie.model.Client;
import com.example.movie.repository.ClientRepo;
import com.example.movie.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class ClientController {
    @Autowired
    private ClientService clientService;
    private final ClientRepo repo;

    public ClientController(ClientRepo repo) {
        this.repo = repo;
    }


    @GetMapping("/getUser")
    public ResponseEntity get(){
        return ResponseEntity.ok(this.repo.findAll());
    }

    @PostMapping("/saveUser")
    public boolean post(@RequestBody Client client){
         return this.clientService.saveClient(client);
    }

}
