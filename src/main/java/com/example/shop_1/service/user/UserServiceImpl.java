package com.example.shop_1.service.user;

import com.example.shop_1.entity.User;
import com.example.shop_1.dto.UserCreateDto;
import com.example.shop_1.entity.UserRole;
import com.example.shop_1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    @Override
    public User addUser(UserCreateDto userCreateDto, UserRole role) {
        User user = modelMapper.map(userCreateDto, User.class);
        user.setRole(List.of(UserRole.USER));
        return userRepository.save(user);
    }
}
