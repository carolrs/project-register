    package io.carolrs.productregister.repository;

    import io.carolrs.productregister.entities.Category;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface CategoryRepository extends JpaRepository<Category,Long> {

    }
