package com.tefnick.userservice.service;

import com.tefnick.userservice.model.User;

import java.util.List;

public interface UserRepository {
    public List<User> getAllUsers();
}
