package com.gsuretech.services.auth;

import com.gsuretech.dto.SignupRequest;
import com.gsuretech.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);
    boolean hasCustomerWithEmail(String email);
}
