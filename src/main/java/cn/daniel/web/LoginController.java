/**
 * Copyright (c) 2010-2017 http://www.ibookstar.com All Rights Reserved.
 */

package cn.daniel.web;

import cn.daniel.domain.User;
import cn.daniel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * 登录.
 *
 * @author liuyong 2017/11/14 0014 12:11
 * @version V2.0
 */
@RestController
@EnableAutoConfiguration
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String home() {
        return "Hello World!";
    }

    @GetMapping(value = "/signup")
    public Map signup(String username, String password) {
        boolean saved = userService.saveOrUpdate(new User(username, password));
        if (saved) {
            return Collections.singletonMap("user", userService.findByUsername(username));
        }
        return Collections.emptyMap();
    }

    @GetMapping(value = "/signin")
    public Map signin(String username) {
        return Collections.singletonMap("user", userService.findByUsername(username));
    }

    @PostMapping(value = "/signin")
    public Map signin(String username, String password) {
        return Collections.singletonMap("user", userService.findByUsername(username));
    }

    @GetMapping(value = "/all")
    public Page signin(Pageable pageable) {
        return userService.page(pageable);
    }
}
