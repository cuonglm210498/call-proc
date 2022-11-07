package com.example.callstoreprocedure.service;

import com.example.callstoreprocedure.entity.User;

import java.util.List;

/**
 * @author CuongLM18
 * @created 07/11/2022 - 11:20 AM
 * @project call-store-procedure
 */
public interface UserService {

    List<User> getAll(Long id);
}
