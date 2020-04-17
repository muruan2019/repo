package com.company.project.controller;

import com.company.project.Tester;
import com.company.project.core.Result;
import com.company.project.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class UserControllerTest extends Tester {

    @Autowired
    UserController userController;

    @Test
    public void add() {
        User user = new User();
        user.setNickName("测试小白");
        user.setPassword("123456");
        user.setRegisterDate(new Date());
        user.setSex(1);
        user.setUsername("测试小白");
        userController.add(user);
    }

    @Test
    public void delete() {
        userController.delete(10);
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(10);
        user.setNickName("测试小白");
        user.setPassword("123456");
        user.setRegisterDate(new Date());
        user.setSex(1);
        user.setUsername("测试小白");
        userController.update(user);
    }

    @Test
    public void detail() {
        Result result = userController.detail(10);
    }

    @Test
    public void list() {
        Result result = userController.list(1,3);
    }
}