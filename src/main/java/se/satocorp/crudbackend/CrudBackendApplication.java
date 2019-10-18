package se.satocorp.crudbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.satocorp.crudbackend.model.User;
import se.satocorp.crudbackend.service.UserService;


@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner{

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(CrudBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.createUser(new User("Essoyoo", "kathin"));
        userService.createUser(new User("Crepin", "Mowane"));
        userService.createUser(new User("Rouky", "Tata"));
        userService.createUser(new User("Jesus", "Christ"));
        userService.createUser(new User("Asenci", "ss2i"));
    }
}
