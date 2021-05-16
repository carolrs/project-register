    package io.carolrs.productregister.repository;

    import io.carolrs.productregister.entities.Product;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface ProductRepository extends JpaRepository<Product,Long> {

    }
