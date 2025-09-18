package com.fitness.user.controller;

import com.fitness.user.dto.RegisterRequest;
import com.fitness.user.dto.UserResponse;
import com.fitness.user.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUserProfile(@PathVariable String userId)  {
        // Implementation to get user profile by userId
        return ResponseEntity.ok().body(userService.getUserProfile(userId));
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@Valid @RequestBody RegisterRequest request)  {
        // Implementation to get user profile by userId
        return ResponseEntity.ok().body(userService.register(request));
    }
}
