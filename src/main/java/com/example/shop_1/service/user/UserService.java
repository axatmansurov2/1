package com.example.shop_1.service.user;

import com.example.shop_1.dto.UserCreateDto;
import com.example.shop_1.entity.User;
import com.example.shop_1.entity.UserRole;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User addUser(UserCreateDto user, UserRole role);
}
