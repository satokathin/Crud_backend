package se.satocorp.crudbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.satocorp.crudbackend.model.User;
import se.satocorp.crudbackend.service.UserService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin
public class UserController {

    private UserService userService;

    @PostMapping("user")
    User createUser(@RequestBody User user) {
        if(user != null)
            return userService.createUser(user);
        return null;
    }

    @DeleteMapping("user/{userId}")
    void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }

    @PutMapping("user/{userId}")//user.id must == userId !
    User updateUser(@RequestBody User user, @PathVariable Long userId) {
        return userService.updateUser(user, userId);
    }

    @GetMapping("user/{userId}")
    User findUser(@PathVariable Long userId) {
        return userService.findUser(userId);
    }

    @GetMapping("users")
    List<User> findAllUser() {
        return userService.findAllUsers();
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
}
