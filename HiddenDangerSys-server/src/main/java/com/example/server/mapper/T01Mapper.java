package com.example.server.mapper;

import com.example.server.pojo.RespBean;
import com.example.server.pojo.T01;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 包含全部用户的表 Mapper 接口
 * </p>
 *
 * @author xx
 * @since 2022-03-22
 */
public interface T01Mapper extends BaseMapper<T01> {
   @Insert("insert into t01(F0101,F1201,F0102,F0103,F0104,F0105,F0106,username,password,F0130,F0131,F0132,F0133,enabled) values (#{F0101},'12004',null,#{F0103},#{F0104},#{F0105},null,#{username},#{password},'022-03-21 16:01:38.000000',#{F0131},null,null,1)")
   int addUserbywechat(String F0103, String F0104, String F0101, String F0105,String username,String password, LocalDateTime F0131);

   List<T01> LoginBywechat(String F0104);
  @Select("select * from t01 where F0104=#{F0104}")
   T01 getAdminUserByOpenID(String F0104);
}
