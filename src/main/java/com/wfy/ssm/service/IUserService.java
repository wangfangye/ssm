package com.wfy.ssm.service;

import com.wfy.ssm.model.User;

public interface IUserService {

    public User selectUser(long userId);

}