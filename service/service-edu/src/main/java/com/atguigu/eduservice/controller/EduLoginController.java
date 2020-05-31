package com.atguigu.eduservice.controller;

import com.atguigu.commonutils.R;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName :
 * @Description TODO
 * @Author :
 * @Date :
 * @Version V1.0
 */
@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin
public class EduLoginController {

    /**
     * 功能描述 ：login
     */
    @PostMapping("login")
    public R login() {
        return R.ok().data("token","admin");
    }
    /**
     * 功能描述 ：info
     */
    @GetMapping("info")
    public R info() {
        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}
