package com.example.shop_1.dto;

import com.example.shop_1.entity.UserRole;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.List;

public class UserCreateDto {
    private String name;

    private String username;

    private String email;

    private String password;

}
