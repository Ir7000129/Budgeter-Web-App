package com.sprider.budgeterusersservice.Repository;

import com.sprider.budgeterusersservice.Model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{
    User findByUserName(String userName);
}
