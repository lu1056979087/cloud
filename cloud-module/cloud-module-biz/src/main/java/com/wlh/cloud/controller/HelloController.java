package com.wlh.cloud.controller;

import com.wlh.cloud.api.entity.User;
import com.wlh.cloud.api.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public R<Object> hello() {
        User user = new User();
        return R.success("hello world");
    }

}
