package se.satocorp.crudbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import se.satocorp.crudbackend.model.User;
import se.satocorp.crudbackend.repository.UserJpaRepository;

import java.util.List;

public class TestUserJpa implements UserService {

    private UserJpaRepository userJpaRepository;

    @Override
    public User createUser(User user) {
        return userJpaRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userJpaRepository.deleteById(userId);
    }

    @Override
    public User updateUser(User user, Long id) {
        return userJpaRepository.save(user);
    }

    @Override
    public User findUser(Long id) {
        return userJpaRepository.findById(id).get();
    }

    @Override
    public List<User> findAllUsers() {
        return userJpaRepository.findAll();
    }

    @Autowired
    public TestUserJpa(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }
}
