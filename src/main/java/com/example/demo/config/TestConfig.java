package com.example.demo.config;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired //associa uma instancia do UserRepository no Test Config.
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        //sera executado quando a aplicação for iniciada.

        User user1 = new User(null, "Carol Rodrigues", "carolr@gmail.com", "9998877", "1234567");
        User user2 = new User(null,"Juliano Cervelin", "julianocervelin@gmail.com","99966877","12345678");

        userRepository.saveAll(Arrays.asList(user1,user2)); //comando p/ salvar no banco de dados.
    }
}
