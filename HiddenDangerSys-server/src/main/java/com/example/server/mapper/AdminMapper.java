package com.example.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.server.pojo.T01;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface AdminMapper extends BaseMapper<T01> {

    /**
     * 获取所有操作员
     * @param id
     * @param keywords
     * @return
     */
//    List<T01> getAllAdmins(@Param("id") Integer id,@Param("keywords") String keywords);

}
