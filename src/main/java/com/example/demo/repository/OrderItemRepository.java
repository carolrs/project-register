    package com.example.demo.repository;

    import com.example.demo.entities.OrderItem;
    import com.example.demo.entities.User;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


    }
