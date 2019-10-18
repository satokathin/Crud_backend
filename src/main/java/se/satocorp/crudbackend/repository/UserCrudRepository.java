package se.satocorp.crudbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.satocorp.crudbackend.model.User;

@Repository
public interface UserCrudRepository extends CrudRepository<User, Long> {
}
