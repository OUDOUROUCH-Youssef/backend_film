package com.example.movie.service;

import com.example.movie.model.Client;
import com.example.movie.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepo repo;

    public boolean saveClient(Client client) {
       List<Client> cltSameName= this.repo.findByuserName(client.getUserName());
       List<Client> cltSamePass=this.repo.findBypassword(client.getPassword());
       if(!cltSameName.isEmpty()){
           if(!cltSamePass.isEmpty()){
               return true;
           }
           else return false;
       }else{
           this.repo.save(client);
           return true;
       }

    }


}
