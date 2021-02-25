package com.sprider.budgeterusersservice.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class User {
    @Id
    private String id;

    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String emailAddress;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
}
