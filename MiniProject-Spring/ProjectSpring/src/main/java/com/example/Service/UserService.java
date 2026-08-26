package com.example.Service;

import com.example.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(String name){
        userRepository.save(name);
    }


    public List<String> getAllUser() {
        return userRepository.findAll();
    }
}
