package se.satocorp.crudbackend.service;

import org.springframework.stereotype.Service;
import se.satocorp.crudbackend.model.User;

import java.util.List;

@Service
public interface UserService {

    User createUser(User user);

    void deleteUser(Long userId);

    User updateUser(User user, Long userId);

    User findUser(Long userId);

    List<User> findAllUsers();
}
