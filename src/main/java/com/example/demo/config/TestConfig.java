package com.example.demo.config;

import com.example.demo.entities.Category;
import com.example.demo.entities.Order;
import com.example.demo.entities.OrderStatus;
import com.example.demo.entities.User;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired //associa uma instancia do UserRepository no Test Config.
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {
        //sera executado quando a aplicação for iniciada.

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

        User user1 = new User(null, "Carol Rodrigues", "carolr@gmail.com", "9998877", "1234567");
        User user2 = new User(null,"Juliano Cervelin", "julianocervelin@gmail.com","99966877","12345678");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,user2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, user1);



        userRepository.saveAll(Arrays.asList(user1,user2)); //comando p/ salvar no banco de dados.
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
