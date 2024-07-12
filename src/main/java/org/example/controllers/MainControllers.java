package org.example.controllers;
import org.example.dto.UserDTO;
import org.example.service.userservice.ServiceUser;
import org.example.service.userservice.ServiceUserMain;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainControllers {

ServiceUserMain serviceMain = new ServiceUser();

// добавить пользователя в нашу систему
@PostMapping("/addusers")
public void addUsers(@RequestBody UserDTO userDTO){
serviceMain.addUsers(userDTO);
}

// получить пользователя по имени из нашей системы
@GetMapping("/users/{username}")
public UserDTO getUser(@PathVariable String username){

System.out.printf("=="+username);

return serviceMain.getUser(username);

}







}
