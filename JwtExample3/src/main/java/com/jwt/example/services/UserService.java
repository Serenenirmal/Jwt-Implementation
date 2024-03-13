package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();
    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Nirmal Patel","nirmalpatel1003@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rahul Singh","rahul1556@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Pramit Samanta","pramit@stdio.com"));
        store.add(new User(UUID.randomUUID().toString(),"Meet Vasani","meetvasani1441@accops.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }

}
