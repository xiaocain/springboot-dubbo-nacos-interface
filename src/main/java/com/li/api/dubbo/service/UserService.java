package com.li.api.dubbo.service;

import com.li.api.dubbo.model.User;

import java.util.List;

public interface UserService {
    User getByUserId(Integer userId);

    List<User> getUsers();
}
