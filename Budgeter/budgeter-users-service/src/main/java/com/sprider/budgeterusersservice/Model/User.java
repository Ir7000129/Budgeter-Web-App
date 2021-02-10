package com.sprider.budgeterusersservice.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "users")
@Getter @Setter
public class User {
    @Id
    private String id;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;

    public User() {
    }

    public User(String userName, String password, String id) {
        this.userName = userName;
        this.password = password;
        this.id = id;
    }
}
