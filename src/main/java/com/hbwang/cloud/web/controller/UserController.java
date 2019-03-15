package com.hbwang.cloud.web.controller;

import com.hbwang.cloud.core.entity.User;
import com.hbwang.cloud.core.response.JsonResponse;
import com.hbwang.cloud.core.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wanghongbo
 * @Date: 2018/11/26 09:52
 * @Description:
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user")
    public ResponseEntity<Object> getUser(int id) {
        User user = userService.getUser(id);
        return JsonResponse.success(user);
    }

    @RequestMapping(value = "/user1")
    public ResponseEntity<Object> getUser1(int id) {
        User user = userService.getUser1(id);
        return JsonResponse.success(user);
    }

    @RequestMapping(value = "/")
    public ResponseEntity<Object> index() {
        return JsonResponse.success("你好世界");
    }
}
