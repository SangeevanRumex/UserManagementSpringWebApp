package com.example.UserManagementSpringWebApp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserManagementService {
    private static List<User> getDataFromDB() {
        List<User> userList = new ArrayList<User>();
        userList.add (new User (1,"Sangeevan"));
        userList.add (new User (2,"Sangee"));
        userList.add (new User (3,"Geevan"));
        return userList;
    }

    private List<User> users = getDataFromDB();

    public List<User> getUsers() {
        return users;
    }

    public List<User> getUserById(int id) {
        return getUsers().stream().filter(user -> user.getId() == id)
                .collect(Collectors.toList());
    }

    public String addUser(User user) {
        users.add(user);
        return "User successfully created";
    }

    public String updateUser(int id, User user) {
        for(int i=0; i<users.size();i++){
            User u = users.get(i);
            if(u.getId() == id){
                users.set(i,user);
                return "User successfully updated";
            }
        }
        return "User not found";
    }

    public String deleteUser(int id) {
        for(int i=0; i<users.size();i++){
            User u = users.get(i);
            if(u.getId() == id){
                users.remove(i);
                return "User successfully deleted";
            }
        }
        return "User not found";
    }
}
