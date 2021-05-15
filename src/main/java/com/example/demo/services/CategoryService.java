package com.example.demo.services;

import com.example.demo.entities.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired //injeção de dependencia
    private CategoryRepository repository;

    public List<Category> findAll (){
        return repository.findAll(); //repassa a chamada p/ repository.

    }
    public Category findById (Long id){
        Optional<Category> byId = repository.findById(id);
        return byId.get(); //vai retornar o que estiver dentro do User.

    }


}
