package com.example.springsecurity.model.Dto;

import com.example.springsecurity.entity.RoleName;

public record CreateUserDto(

        String email,
        String password,
        RoleName role

) {
}