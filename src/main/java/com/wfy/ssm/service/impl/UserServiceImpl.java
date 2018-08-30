package com.wfy.ssm.service.impl;


import com.wfy.ssm.dao.IUserDao;
import com.wfy.ssm.model.User;
import com.wfy.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}
