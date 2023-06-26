package com.playdata.user.service;

import com.playdata.user.domain.dto.User;
import com.playdata.user.domain.request.LoginRequest;
import com.playdata.user.domain.request.SignupRequest;

public interface UserService {
    User login(LoginRequest request);

    boolean signup(SignupRequest request);

}
