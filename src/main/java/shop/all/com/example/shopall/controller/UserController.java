package shop.all.com.example.shopall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.all.com.example.shopall.Service.UserService;
import shop.all.com.example.shopall.dto.LoginRequestDTO;
import shop.all.com.example.shopall.dto.OrderRequestDTO;
import shop.all.com.example.shopall.entities.OrderEntity;
import shop.all.com.example.shopall.entities.UserEntity;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Create a new user
    @PostMapping("/register")
    public ResponseEntity<UserEntity> registerUser(@RequestBody UserEntity user) {
        UserEntity createdUser = userService.registerUser(user);
        return ResponseEntity.ok(createdUser);
    }

    // Get a user by ID
    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable Long userId) {
        UserEntity user = userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }


    // Update a user's information
    @PutMapping("/{userId}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable Long userId, @RequestBody UserEntity updatedUser) {
        UserEntity user = userService.updateUser(userId, updatedUser);
        return ResponseEntity.ok(user);
    }

    // Delete a user
    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok("User deleted successfully.");
    }

    @PostMapping("/login")
    public ResponseEntity<Long> getUserIdByEmailAndPassword(@RequestBody LoginRequestDTO loginRequest) {
        Long userId = userService.getUserIdByEmailAndPassword(loginRequest.getEmail(), loginRequest.getPassword());
        if (userId != null) {
            return ResponseEntity.ok(userId);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }



}

