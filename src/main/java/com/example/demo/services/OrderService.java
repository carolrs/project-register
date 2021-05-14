package com.example.demo.services;

import com.example.demo.entities.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired //injeção de dependencia
    private OrderRepository repository;

    public List<Order> findAll (){
        return repository.findAll(); //repassa a chamada p/ repository.

    }
    public Order findById (Long id){
        Optional<Order> byId = repository.findById(id);
        return byId.get(); //vai retornar o que estiver dentro do User.

    }
}
