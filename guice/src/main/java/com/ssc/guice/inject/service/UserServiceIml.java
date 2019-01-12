package com.ssc.guice.inject.service;

import com.ssc.guice.inject.service.UserService;

import java.util.logging.Logger;

public class UserServiceIml implements UserService {
    @Override
    public void process() {
        Logger.getLogger("").info("Hello qxf");
    }
}