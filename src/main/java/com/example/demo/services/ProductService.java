package com.example.demo.services;

import com.example.demo.entities.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired //injeção de dependencia
    private ProductRepository repository;

    public List<Product> findAll (){
        return repository.findAll(); //repassa a chamada p/ repository.

    }
    public Product findById (Long id){
        Optional<Product> byId = repository.findById(id);
        return byId.get(); //vai retornar o que estiver dentro do User.

    }


}
