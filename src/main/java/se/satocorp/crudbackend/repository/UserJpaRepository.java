package se.satocorp.crudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.satocorp.crudbackend.model.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
