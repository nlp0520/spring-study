package com.mashibing.test.service;

import com.mashibing.test.dao.UserDao;
import com.mashibing.test.dao.UserDaoImpl;

/**
 * @Auther:niulipeng
 * @Date:2021/4/8
 * @Description:com.mashibing.service
 * @Version:1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void getUser() {
        userDao.getUser();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userDao=" + userDao +
                '}';
    }
}
