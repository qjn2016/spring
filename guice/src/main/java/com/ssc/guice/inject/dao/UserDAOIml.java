package com.ssc.guice.inject.dao;

import com.ssc.guice.dto.User;

import java.util.*;

public class UserDAOIml implements UserDAO{
    @Override
    public void userIns() {

    }

    @Override
    public void userUpd() {

    }

    @Override
    public void userDel() {

    }

    @Override
    public List<User> getAllUser() {
        User user = new User();
        user.setId("001");
        user.setUserName("qxf");

        List<User> list = new ArrayList<User>();
        list.add(user);
        return list;
    }
}