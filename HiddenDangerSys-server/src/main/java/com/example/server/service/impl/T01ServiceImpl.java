package com.example.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.server.mapper.AdminMapper;
import com.example.server.mapper.T01Mapper;
import com.example.server.pojo.RespBean;
import com.example.server.pojo.T01;
import com.example.server.service.IT01Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 包含全部用户的表 服务实现类
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@Service
public class T01ServiceImpl extends ServiceImpl<T01Mapper, T01> implements IT01Service {


    @Autowired
    private T01Mapper  t01Mapper;
    @Override
    public RespBean addUser(T01 t01) {
// 获取当前日期时间
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  get可用这个，返回出来是string
//        LocalDateTime L=dtf.format(LocalDateTime.now());
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("xxx"+dt);
        t01.setF0131(dt);

        if(1==t01Mapper.insert(t01)){
            System.out.println("添加用户成功");
            return RespBean.success("添加成功");
        }
        else {
            System.out.println("添加失败");
            return RespBean.error("添加失败");
        }
    }

    @Override
    public RespBean maxUserID() {
        List<Map<String, Object>> maps= t01Mapper.selectMaps(new QueryWrapper<T01>().select("max(F0101)"));
        System.out.println("xusa"+ t01Mapper.selectMaps(new QueryWrapper<T01>().select("max(F0101)")));
        return RespBean.success("获取到的用户id", String.format("%08d", Integer.parseInt(maps.get(0).get("max(F0101)").toString()) + 1));
    }

    @Override
    public int addUserbywechat(String F0103, String F0104, String F0101, String F0105 ,String username, String password,LocalDateTime F0131) {
        return t01Mapper.addUserbywechat(F0103, F0104, F0101, F0105,username,password,F0131);
    }


}
