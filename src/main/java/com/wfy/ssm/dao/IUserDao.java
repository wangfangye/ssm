package com.wfy.ssm.dao;


import com.wfy.ssm.model.User;

public interface IUserDao {

    User selectUser(long id);

}
