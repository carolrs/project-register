    package com.example.demo.repository;

    import com.example.demo.entities.Category;
    import com.example.demo.entities.User;
    import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.List;

    public interface CategoryRepository extends JpaRepository<Category,Long> {

    }
