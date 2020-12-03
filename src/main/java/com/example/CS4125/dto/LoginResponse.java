package com.example.CS4125.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginResponse {
    private String jwt;
    private String username;
    private Instant expiresAt;
}
