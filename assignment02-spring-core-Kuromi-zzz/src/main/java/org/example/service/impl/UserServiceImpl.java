package org.example.service.impl;

import org.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    @Override
    public void addUser(String username) {
        System.out.println("添加用户: " + username);
    }

    @Override
    public void deleteUser(String username) {
        System.out.println("删除用户: " + username);
    }
} 