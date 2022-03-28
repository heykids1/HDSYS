package com.example.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.server.config.jwt.JwtTokenUtil;
import com.example.server.mapper.AdminMapper;
import com.example.server.mapper.T01Mapper;
import com.example.server.pojo.RespBean;

import com.example.server.pojo.T01;
import com.example.server.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @since 2020-11-14
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, T01> implements IAdminService {

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private  AdminMapper adminMapper;
    @Autowired
    private T01Mapper t01Mapper;


    /**
     * 登录之后返回token
     * @param username
     * @param password
//     * @param code
     * @param request
     * @param request
     * @return
     */
    @Override
    public RespBean login(String username, String password, String code, HttpServletRequest request) {
        //登录
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if (userDetails == null || passwordEncoder.matches(password,userDetails.getPassword())){ //需要加非，加密导致匹配不对
            System.out.println("xxxxx"+password);
            System.out.println("rrr"+userDetails.getPassword());
            System.out.println(!passwordEncoder.matches(password,userDetails.getPassword()));

            return RespBean.error("AdminServiceImpl + 用户名或密码不正确");
        }
        if (!userDetails.isEnabled()){
            return RespBean.error("AdminServiceImpl + 账号被禁用");
        }
        //验证验证码
        String captcha = (String) request.getSession().getAttribute("captcha");
        if (StringUtils.isEmpty(code)|| !captcha.equalsIgnoreCase(code)){
            return RespBean.error("验证码填写错误");
        }

        //更新security登录用户对象
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        //生成token
        String token = jwtTokenUtil.generateToken(userDetails);
        Map<String,Object> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return RespBean.success("登录成功",tokenMap);
    }


    @Override
    public RespBean LoginBywechat(String F0104, String username,HttpServletRequest request) {

        List<T01> x= t01Mapper.LoginBywechat(F0104);
        System.out.println("我是T01d的结果"+x);
        T01 t=x.get(0);
        if(x==null||t.getEnabled()==false){
            return RespBean.error("验证码填写错误");
        }else{
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        //更新security登录用户对象
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        //生成token
        String token = jwtTokenUtil.generateToken(userDetails);
        Map<String,Object> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return RespBean.success("登录成功",tokenMap);
        }
    }

    @Override
    public T01 getAdminUserByOpenID(String F0104) {
        return t01Mapper.getAdminUserByOpenID(F0104);
    }

    /**
     * 获取当前登录用户信息
     * @param username
     * @return
     */
    @Override
    public T01 getAdminByUserName(String username) {

        return adminMapper.selectOne(new QueryWrapper<T01>().eq("username",username).eq("enabled",true));
    }



    /**
     * 根据用户ID查询角色
     * @param adminId
     * @return
     */
//    @Override
//    public List<Role> getRolesByAdminId(Integer adminId) {
//        return roleMapper.getRolesByAdminId(adminId);
//    }

    /**
     * 获取所有操作员
     * @param keywords
     * @return
     */
//    @Override
//    public List<Admin> getAllAdmins(String keywords) {
//        Integer id = ((Admin)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
//        return adminMapper.getAllAdmins(id,keywords);
//    }

    /**
     * 更新操作员角色
     * @param adminId
     * @param rids
     * @return
     */
//    @Override
//    @Transactional
//    public RespBean updateAdminRole(Integer adminId, Integer[] rids) {
//        adminRoleMapper.delete(new QueryWrapper<AdminRole>().eq("adminId",adminId));
//        Integer result = adminRoleMapper.addRole(adminId, rids);
//        if (rids.length == result){
//            return RespBean.success("更新成功");
//        }
//        return RespBean.error("更新失败");
//    }

    /**
     * 更新用户密码
     * @param oldPass
     * @param pass
     * @param adminId
     * @return
     */
//    @Override
//    public RespBean updatePassword(String oldPass, String pass, Integer adminId) {
//        Admin admin = adminMapper.selectById(adminId);
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        if (encoder.matches(oldPass,admin.getPassword())){
//            admin.setPassword(encoder.encode(pass));
//            int i = adminMapper.updateById(admin);
//            if (i == 1){
//                return RespBean.success("更新成功");
//            }
//        }
//        return RespBean.error("更新失败");
//    }

    /**
     * 更新用户头像
     * @param url
     * @param id
     * @param authentication
     * @return
     */
//    @Override
//    public RespBean updateAdminUserFace(String url, Integer id, Authentication authentication) {
//        Admin admin = adminMapper.selectById(id);
//        admin.setUserFace(url);
//        int i = adminMapper.updateById(admin);
//        if (i == 1){
//            Admin principal = (Admin) authentication.getPrincipal();
//            principal.setUserFace(url);
//            //更新Authentication
//            SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(admin,authentication.getCredentials(),authentication.getAuthorities()));
//            return RespBean.success("更新成功",url);
//        }
//        return RespBean.error("更新失败");
//    }
}
