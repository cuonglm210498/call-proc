package com.example.callstoreprocedure.controller;

import com.example.callstoreprocedure.entity.User;
import com.example.callstoreprocedure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author CuongLM18
 * @created 07/11/2022 - 11:50 AM
 * @project call-store-procedure
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/{id}")
    public ResponseEntity<List<User>> getAll(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getAll(id));
    }
}
