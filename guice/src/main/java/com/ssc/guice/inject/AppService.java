package com.ssc.guice.inject;

import com.google.inject.Inject;
import com.ssc.guice.inject.service.UserService;

public class AppService {
    private UserService userService;

    @Inject
    public AppService(UserService userService) {
        this.userService = userService;
    }

    public void work(){
        userService.process();
    }
}


