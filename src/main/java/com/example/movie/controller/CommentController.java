package com.example.movie.controller;



import com.example.movie.model.Comment;
import com.example.movie.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/getComment")
    public ResponseEntity get(Long id){
        return ResponseEntity.ok(this.commentService.getByFilm(id));
    }

    @PostMapping("/postComment")
    public Comment post(@RequestBody Comment comment){
        return this.commentService.post(comment);
    }
}
