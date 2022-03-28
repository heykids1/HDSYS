package com.example.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.server.pojo.RespBean;
import com.example.server.pojo.T01;

import java.time.LocalDateTime;

/**
 * <p>
 * 包含全部用户的表 服务类
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
public interface IT01Service extends IService<T01> {

   RespBean addUser(T01 t01);


   RespBean maxUserID();

   int addUserbywechat(String F0103, String F0104, String F0101, String F0105,String username, String password, LocalDateTime F0131);


}
