package com.example.server.controller;

import com.example.server.pojo.AdminLogin;
import com.example.server.pojo.RespBean;

import com.example.server.pojo.T01;
import com.example.server.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;


/**
 * 登录
 *
 * @author zahnglishen
 */
@Api(tags = "AdminLoginController")
@RestController
public class AdminLoginController {

    @Autowired
    private IAdminService adminService;

    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public RespBean login(@RequestBody AdminLogin adminLogin, HttpServletRequest request){
        return adminService.login(adminLogin.getUsername(),adminLogin.getPassword(),adminLogin.getCode(),request);
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @GetMapping("/admin/info")
    public T01 getAdminInfo(Principal principal){
        System.out.println("-----------------------------------");
        if (principal == null){
            return null;
        }
        String username = principal.getName();
        T01 admin = adminService.getAdminByUserName(username);

        System.out.println("-----------------------------------admin = " + admin);

        admin.setPassword(null);
//        admin.setRoles(adminService.getRolesByAdminId(admin.getId()));
        return admin;
    }

    @ApiOperation(value = "微信登录")
    @PostMapping("/LoginBywechat")
    public RespBean LoginBywechat(@RequestBody T01 t02, HttpServletRequest request){
        String  F0104= t02.getF0104();
        System.out.println("ssfe"+F0104);
        T01 t01=adminService.getAdminUserByOpenID(F0104);
        String username= t01.getUsername();
        System.out.println("获取到的usernam"+username);
        return adminService.LoginBywechat(F0104,username,request);
    }

    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public RespBean logout(){
        return RespBean.success("注销成功！");
    }
}
