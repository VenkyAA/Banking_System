package com.microservices.user_service.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {
    private long id;

    @NotEmpty(message = "Username must not be empty")
    private String username;

    @NotEmpty(message = "Password must not be empty")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;
    
    
    private String role;
}


