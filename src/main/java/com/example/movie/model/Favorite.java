package com.example.movie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Favorite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    private long id_user;
    private long id_film;

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public void setId_film(long id_film) {
        this.id_film = id_film;
    }

    public long getId() {
        return id;
    }

    public long getId_user() {
        return id_user;
    }

    public long getId_film() {
        return id_film;
    }
}
