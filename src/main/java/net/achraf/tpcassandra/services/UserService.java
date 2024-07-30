package net.achraf.tpcassandra.services;

import net.achraf.tpcassandra.entities.User;
import net.achraf.tpcassandra.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void addUser(String name, int age,String email){
        User user = new User();
        user.setId(UUID.randomUUID());
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        userRepository.insert(user);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
