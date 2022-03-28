package com.example.server.service.impl;

import com.example.server.pojo.T04;
import com.example.server.mapper.T04Mapper;
import com.example.server.service.IT04Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 包含隐患的安全等级，与隐患表相关联 服务实现类
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@Service
public class T04ServiceImpl extends ServiceImpl<T04Mapper, T04> implements IT04Service {

}
