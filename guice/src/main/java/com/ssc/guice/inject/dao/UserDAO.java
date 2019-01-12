package com.ssc.guice.inject.dao;

import com.ssc.guice.dto.User;

import java.util.List;

public interface UserDAO {

    public void userIns();

    public void userUpd();

    public void userDel();

    public List<User> getAllUser();
}