package com.tefnick.userservice.service;

import com.tefnick.userservice.model.User;
import com.tefnick.userservice.model.UserDTO;

import java.util.List;

public interface UserRepository {
    public UserDTO getAllUsers();
}
