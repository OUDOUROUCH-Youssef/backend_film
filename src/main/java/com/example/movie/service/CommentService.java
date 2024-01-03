package com.example.movie.service;

import com.example.movie.model.Comment;
import com.example.movie.model.Favorite;
import com.example.movie.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService {
    @Autowired
    private CommentRepo repo;
    public Comment post(Comment comment){
        return this.repo.save(comment);
    }

    public List<Comment> getByFilm(long id_film){
        List<Comment> comments=this.repo.findAll();
        return comments.stream().filter(c->c.getId_film()==id_film).collect(Collectors.toList());
    }

}
