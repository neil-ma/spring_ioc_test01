package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao ;

    public void setUserDao(UserDao userDao){
        System.out.println("BeanFactory 依赖注入UserDao属性对象：" + userDao);
        this.userDao = userDao ;
    }

}
