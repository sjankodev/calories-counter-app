package com.service;

import com.entity.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();

    UserDto findById(String userId);

    UserDto save(UserDto foodDto);

    UserDto update(UserDto foodDto);

    void delete(String userId);
}
