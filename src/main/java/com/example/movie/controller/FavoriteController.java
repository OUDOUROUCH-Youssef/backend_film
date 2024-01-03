package com.example.movie.controller;

import com.example.movie.model.Favorite;
import com.example.movie.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/favorite")
public class FavoriteController {
    @Autowired
    private FavoriteService service;

    @GetMapping("/getFavorite")
    public ResponseEntity get(Long id){
        return ResponseEntity.ok(this.service.getByUser(id));
    }

    @PostMapping("/postFavorite")
    public Favorite post(@RequestBody Favorite favorite){
        return this.service.post(favorite);
    }
}
