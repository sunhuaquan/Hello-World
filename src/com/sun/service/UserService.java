package com.sun.service;

import com.sun.domain.User;

public interface UserService {

     boolean isExist(User user);

     User Login(String name,String password);
}
