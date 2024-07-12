package org.example.service.userservice;


import org.example.dao.userrepository.UserRepository;
import org.example.dao.userrepository.collections.UserRepositoryCollections;
import org.example.dto.UserDTO;
import org.example.model.User;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser implements ServiceUserMain {

UserRepository userRepository = new UserRepositoryCollections();

@Override
public void addUsers(UserDTO userDTO) {

    User new_user = new User();
    new_user.setName(userDTO.getName());
    new_user.setSurname(userDTO.getSurname());
    new_user.setEmail(userDTO.getEmail());

    userRepository.addUsers(new_user);

}

@Override
public UserDTO getUser(String name) {


User user = userRepository.getUser(name);


UserDTO userDTO = new UserDTO();
userDTO.setName(user.getName());
userDTO.setSurname(user.getSurname());
userDTO.setEmail(userDTO.getEmail());

    System.out.printf("userDTO "+userDTO);


return userDTO;

}
}
