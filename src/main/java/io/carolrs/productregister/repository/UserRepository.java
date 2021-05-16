    package io.carolrs.productregister.repository;

    import io.carolrs.productregister.entities.User;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User,Long> {


    }
