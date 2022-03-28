package com.example.server.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.example.server.pojo.RespBean;
import com.example.server.pojo.T01;

import javax.servlet.http.HttpServletRequest;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface IAdminService extends IService<T01> {

    //登录之后返回token
    RespBean login(String username, String password,String code, HttpServletRequest request);

    //根据用户名获取用户信息
    T01 getAdminByUserName(String username);

    RespBean LoginBywechat(String F0104, String username,HttpServletRequest request);

    T01 getAdminUserByOpenID(String F0104);
    /**
     * 根据用户ID查询角色列表
     * @param adminId
     * @return
     */
//    List<Role> getRolesByAdminId(Integer adminId);

    /**
     * 获取所有操作员
     * @param keywords
     * @return
     */
//    List<Admin> getAllAdmins(String keywords);

    /**
     * 更新操作员角色
     * @param adminId
     * @param rids
     * @return
     */
//    RespBean updateAdminRole(Integer adminId,Integer[] rids);

    /**
     * 更新用户密码
     * @param oldPass
     * @param pass
     * @param adminId
     * @return
     */
//    RespBean updatePassword(String oldPass,String pass,Integer adminId);

    /**
     * 更新用户头像
     * @param url
     * @param id
     * @param authentication
     * @return
     */
//    RespBean updateAdminUserFace(String url, Integer id, Authentication authentication);
}