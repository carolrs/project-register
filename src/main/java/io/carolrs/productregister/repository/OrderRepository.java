    package io.carolrs.productregister.repository;

    import io.carolrs.productregister.entities.Order;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface OrderRepository extends JpaRepository<Order,Long> {



    }
