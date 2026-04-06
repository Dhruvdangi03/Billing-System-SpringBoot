package com.Dhruv.BillingSystem.controllers;

import com.Dhruv.BillingSystem.DTO.user.UserDTO;
import com.Dhruv.BillingSystem.entities.User;
import com.Dhruv.BillingSystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(UserDTO userDTO){
        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable Long userId) {
        User user = userService.getUserById(userId);
        if(user == null)
            return ResponseEntity.ok("User Not found");
        return ResponseEntity.ok(user);
    }

    @PutMapping
    public ResponseEntity<?> updateUser(Long userId, UserDTO userDTO) {
        return ResponseEntity.ok(userService.updateUser(userId, userDTO));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUserById(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.deleteUserByUserId(userId));
    }
}
