package io.carolrs.productregister.services;

import io.carolrs.productregister.entities.Category;
import io.carolrs.productregister.repository.CategoryRepository;
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
