package com.example.server.service.impl;

import com.example.server.pojo.T10;
import com.example.server.mapper.T10Mapper;
import com.example.server.service.IT10Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 耗材库（各种耗材的字典及单位） 服务实现类
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@Service
public class T10ServiceImpl extends ServiceImpl<T10Mapper, T10> implements IT10Service {

}
