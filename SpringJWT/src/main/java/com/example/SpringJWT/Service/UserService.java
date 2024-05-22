package com.example.SpringJWT.Service;

import com.example.SpringJWT.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service

public class UserService {
    private List<User> store = new ArrayList<>();
//    User user = new User();
    private User user;

    public UserService(){
        user = new User(UUID.randomUUID().toString(),"Viraj","mahodayviraj@gmail.com");
        store.add(user);
        store.add(new User(UUID.randomUUID().toString(),"Sunny","mahodaysunny@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ram","mahodayviraj@gmail.com"));
    }

    public List<User> getUser(){
        return this.store;
    }
}
