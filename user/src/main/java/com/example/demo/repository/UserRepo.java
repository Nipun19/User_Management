package com.example.demo.repository;

import com.example.demo.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value = "Select * from User where id = ?1", nativeQuery = true)    //?1 means argument 1 of the getuserbyUserId()
    User getUserByUserId(String userId);



}
