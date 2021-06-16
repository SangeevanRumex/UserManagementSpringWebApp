package com.example.UserManagementSpringWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserManagementController {

   @Autowired
    UserManagementService service;

    @GetMapping("/users")
    public List<User> getUsers() {
        return service.getUsers();
    }

    @GetMapping("/search-user/{id}")
    public List<User> getUserById(@PathVariable int id){
        return service.getUserById(id);
    }

    @PostMapping("/add-user")
    public String createUser(@RequestBody User user){
        return service.addUser(user);
    }

    @PutMapping("/update-user/{id}")
    public String updateUser(@RequestBody User user,@PathVariable int id){
        return service.updateUser(id,user);
    }

    @DeleteMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }

}
