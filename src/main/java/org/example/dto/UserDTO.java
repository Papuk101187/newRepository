package org.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {



@JsonProperty("name")
private String name;

public void setName(String name) {
    this.name = name;
}

public String getName() {
    return name;
}

public String getSurname() {
    return surname;
}

    public void setSurname(String surname) {
        this.surname = surname;
    }

public String getEmail() {
    return email;
}



public void setEmail(String email) {
    this.email = email;
}

@JsonProperty("surname")
private String surname;

@JsonProperty("email")
private String email;







}






