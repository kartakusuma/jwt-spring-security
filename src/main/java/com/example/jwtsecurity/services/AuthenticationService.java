package com.example.jwtsecurity.services;

import com.example.jwtsecurity.dto.JwtAuthenticationResponse;
import com.example.jwtsecurity.dto.RefreshTokenRequest;
import com.example.jwtsecurity.dto.SigninRequest;
import com.example.jwtsecurity.dto.SignupRequest;
import com.example.jwtsecurity.entities.User;

public interface AuthenticationService {
    User signup(SignupRequest signupRequest);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
