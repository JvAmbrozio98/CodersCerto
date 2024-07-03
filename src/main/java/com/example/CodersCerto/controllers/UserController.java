package com.example.CodersCerto.controllers;

import com.example.CodersCerto.models.UserModel;
import com.example.CodersCerto.repositories.UserModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserModelRepository userModelRepository;

    @PostMapping("/test")
    public ResponseEntity<String> createUser (@RequestBody UserModel userModel) {
        userModelRepository.save(userModel);
        String message = "Its working as expected";
        return  ResponseEntity.ok(message);
    }
}
