package com.ra.model.service;

import com.ra.model.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> findAll();

}
