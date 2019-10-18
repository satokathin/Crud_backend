package se.satocorp.crudbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.satocorp.crudbackend.model.User;
import se.satocorp.crudbackend.repository.UserCrudRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MyUserService implements UserService {

    private UserCrudRepository userCrudRepository;

    @Override
    public User createUser(User user) {
        return userCrudRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userCrudRepository.deleteById(userId);
    }

    @Override
    public User updateUser(User user, Long userId) {
        if (userCrudRepository.existsById(userId))
            return userCrudRepository.save(user);
        return null;
    }

    @Override
    public User findUser(Long userId) {
        return userCrudRepository.findById(userId).get();
    }

    @Override
    public List<User> findAllUsers() {
        List<User> list = new ArrayList<>();
        userCrudRepository.findAll().forEach( list :: add);
        return list;
        /*Iterable<User> iterable = userCrudRepository.findAll();
        for (User user:
             iterable) {
            list.add(user);
        }
        return list;*/
    }

    @Autowired
    public MyUserService(UserCrudRepository userCrudRepository) {
        this.userCrudRepository = userCrudRepository;
    }
}
