package com.example.movie.model;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long id_film;
    private long id_user;
    private String caption;
    private String createdAT;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public Comment(long id, long id_film, long id_user, String caption, String createdAT, String userName) {
        this.id = id;
        this.id_film = id_film;
        this.id_user = id_user;
        this.caption = caption;
        this.createdAT = createdAT;
        this.userName = userName;
    }

    public Comment() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public long getId_film() {
        return id_film;
    }

    public void setId_film(long id_film) {
        this.id_film = id_film;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(String createdAT) {
        this.createdAT = createdAT;
    }
}
