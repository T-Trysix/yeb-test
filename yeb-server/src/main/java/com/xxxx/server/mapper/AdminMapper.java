package com.xxxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.server.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zhanglishen
 * @since 2021-04-14
 */
@Repository
public interface AdminMapper extends BaseMapper<Admin> {

    List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);
}
