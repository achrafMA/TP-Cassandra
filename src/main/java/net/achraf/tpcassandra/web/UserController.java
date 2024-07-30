package net.achraf.tpcassandra.web;

import net.achraf.tpcassandra.entities.User;
import net.achraf.tpcassandra.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/users")
    public String saveUsers(@RequestParam String name,@RequestParam int age,@RequestParam String email){
        userService.addUser(name, age, email);
        return "User saved";

    }
}
