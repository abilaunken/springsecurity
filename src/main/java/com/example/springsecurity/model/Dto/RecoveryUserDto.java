package com.example.springsecurity.model.Dto;

import com.example.springsecurity.entity.Role;

import java.util.List;

public record RecoveryUserDto(

        Long id,
        String email,
        List<Role> roles

) {
}
