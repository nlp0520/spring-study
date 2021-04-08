package com.mashibing.test;

import com.mashibing.test.service.UserServiceImpl;

/**
 * @Auther:niulipeng
 * @Date:2021/4/8
 * @Description:com.mashibing
 * @Version:1.0
 */
public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.getUser();
    }
}
