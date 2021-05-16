    package io.carolrs.productregister.repository;

    import io.carolrs.productregister.entities.OrderItem;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


    }
