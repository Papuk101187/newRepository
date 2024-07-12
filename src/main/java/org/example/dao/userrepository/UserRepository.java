package org.example.dao.userrepository;

import org.example.model.User;

public interface UserRepository {


    public void addUsers(User user);
    User getUser(String name);



}
