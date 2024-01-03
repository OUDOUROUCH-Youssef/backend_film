package com.example.movie.repository;

import com.example.movie.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepo extends JpaRepository<Client,Long> {

    List<Client> findByuserName(String userName);

    List<Client> findBypassword(String password);
}
