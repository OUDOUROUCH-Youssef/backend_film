package com.example.movie.repository;

import com.example.movie.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment,Long> {
}
