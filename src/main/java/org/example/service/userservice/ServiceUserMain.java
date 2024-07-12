package org.example.service.userservice;

import org.example.dto.UserDTO;

public interface ServiceUserMain {


    void addUsers(UserDTO userDTO); // добавить пользователя
    UserDTO getUser(String name);

}
