package com.example.server.controller;


import com.example.server.pojo.RespBean;
import com.example.server.pojo.T01;
import com.example.server.pojo.T12;
import com.example.server.service.IAdminService;
import com.example.server.service.IT01Service;
import com.example.server.service.IT12Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 从前端拿搭配数据的post
 * 如果前端什么没给就能那我的数据get
 * <p>
 * 包含全部用户的表 前端控制器
 * </p>
 *
 * @author xx
 * @since 2022-03-22
 */
@RestController
//@RequestMapping("/t01")
public class T01Controller {
    @Autowired
    private IT01Service t01Service;
    @Autowired
    private IT12Service t12Service;
    @Autowired
    private IAdminService adminService;


    @ApiOperation("获取工号")
    @GetMapping("/userID")
    public  RespBean maxUserID(){
        return t01Service.maxUserID();
    }


    //添加员工之前要先知道该员工的职位名称而不是职位ID
    @ApiOperation("添加新用户")
    @PostMapping("/")
    public RespBean addUser(@RequestBody T01 t01){
        return t01Service.addUser(t01);
    }

    @ApiOperation("添加T12表中的职位名称")
    @GetMapping("/T12")
    public List<T12> getAllJobName(){
//用mybatisplus自带的代表查询的方法就可
        System.out.println("xxxxxx"+t12Service.list());
        return t12Service.list();
    }

//   创建成功返回code ：500 ，obj 1，message: "用户创建成功"
//   创建失败返回code : 500 ,message:  "创建失败"
    @ApiOperation(value = "通过微信小程序创建用户")
    @PostMapping("/addUserbywechat")

    public RespBean addUserbywechat(@RequestBody T01 t01){
           String F0103= t01.getF0103();
           String F0104= t01.getF0104();
           String F0105= t01.getF0105();
           String F0101= (String) maxUserID().getObj();

          DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
          LocalDateTime F0131 = LocalDateTime.now();
          System.out.println("我是时间"+F0131);
          String username1 = df.format(F0131);
          String username="admin".concat(username1);
          System.out.println(username);
          String password ="123456";

          int x=t01Service.addUserbywechat(F0103,F0104,F0101,F0105,username,password,F0131 );
          System.out.println("x的值为"+x);

          RespBean respBean=new RespBean();
         if(x==1){
             return respBean.success("用户创建成功",1);
         }else{
             return respBean.error("创建失败");
         }
    }

    @ApiOperation(value = "根据openid获取username")
    @PostMapping("/getAdminUserByOpenID")
    public T01 getAdminUserByOpenID( @RequestBody T01 t01){
        String F0104= t01.getF0104();
        return  adminService.getAdminUserByOpenID(F0104);
    }



}
