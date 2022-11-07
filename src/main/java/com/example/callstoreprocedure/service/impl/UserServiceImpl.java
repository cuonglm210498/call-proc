package com.example.callstoreprocedure.service.impl;

import com.example.callstoreprocedure.entity.User;
import com.example.callstoreprocedure.repository.UserRepository;
import com.example.callstoreprocedure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CuongLM18
 * @created 07/11/2022 - 11:21 AM
 * @project call-store-procedure
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll(Long id) {
        return userRepository.getAll(id);
    }
}
