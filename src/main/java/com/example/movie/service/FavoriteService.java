package com.example.movie.service;

import com.example.movie.model.Favorite;
import com.example.movie.repository.FavoriteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FavoriteService {
    @Autowired
    private FavoriteRepo repo;

    public Favorite post(Favorite fvrt){
        List<Favorite> favorites= repo.findAll();
        Optional<Favorite> existingFavorite = favorites.stream()
                .filter(f -> f.getId_film()==(fvrt.getId_film()) && f.getId_user()==(fvrt.getId_user()))
                .findFirst();
        if (existingFavorite.isPresent()) {
            repo.delete(existingFavorite.get());
            return existingFavorite.get();
        }
        else return  this.repo.save(fvrt);
    }

    public List<Favorite> getByUser(long id_user){
        List<Favorite> favorites=this.repo.findAll();
        return favorites.stream().filter(f->f.getId_user()==id_user).collect(Collectors.toList());
    }
}
