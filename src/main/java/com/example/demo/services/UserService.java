package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired //injeção de dependencia
    private UserRepository repository;

    public List<User> findAll (){
        return repository.findAll(); //repassa a chamada p/ repository.

    }
    public User findById (Long id){
        Optional<User> byId = repository.findById(id);
        return byId.get(); //vai retornar o que estiver dentro do User.

    }
}
