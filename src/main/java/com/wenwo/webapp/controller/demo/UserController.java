package com.wenwo.webapp.controller.demo;

import com.wenwo.webapp.entity.demo.User;
import com.wenwo.webapp.service.demo.UserService;
import com.wenwo.webapp.util.LogUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZY
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/save")
    public User saveUser(@RequestBody User user) {
        LogUtil.info("保存用户，入参：{}", user);
        return userService.insert(user);
    }

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userService.queryById(id);
    }

    @RequestMapping("/getUserList")
    public List<User> getUser() {
        LogUtil.info("打印日志");
        return userService.queryAllByLimit(1,10);
    }
}
