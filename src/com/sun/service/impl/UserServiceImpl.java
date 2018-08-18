package com.sun.service.impl;

import com.sun.domain.User;
import com.sun.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public boolean isExist(User user) {
        return user!=null;
    }
}
