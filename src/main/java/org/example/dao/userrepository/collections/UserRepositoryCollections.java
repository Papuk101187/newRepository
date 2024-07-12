package org.example.dao.userrepository.collections;

import org.example.dao.userrepository.UserRepository;
import org.example.model.User;

import java.util.ArrayList;

public class UserRepositoryCollections implements UserRepository {

ArrayList<User> usersArrayList = new ArrayList<>();

@Override
public void addUsers(User user) {
    usersArrayList.add(user);
    int size = usersArrayList.size();
    System.out.printf("size = "+size);

}

    @Override
    public User getUser(String name) {

        for(User u: usersArrayList){
            if(u.getName().equals(name)){
                return u;
            }        }
        return null;

    }


}
