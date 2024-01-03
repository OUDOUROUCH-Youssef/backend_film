package com.example.movie.repository;

import com.example.movie.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FavoriteRepo extends JpaRepository<Favorite,Long> {
}
