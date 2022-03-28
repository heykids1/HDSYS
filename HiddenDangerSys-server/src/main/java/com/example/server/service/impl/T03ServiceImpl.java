package com.example.server.service.impl;

import com.example.server.pojo.T03;
import com.example.server.mapper.T03Mapper;
import com.example.server.service.IT03Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * .隐患类型ID等全部的隐患类型，后期可由用户维护。 服务实现类
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@Service
public class T03ServiceImpl extends ServiceImpl<T03Mapper, T03> implements IT03Service {

}
