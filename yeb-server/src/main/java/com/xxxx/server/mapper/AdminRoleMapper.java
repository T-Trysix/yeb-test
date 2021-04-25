package com.xxxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.server.pojo.AdminRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanglishen
 * @since 2021-04-14
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    Integer addRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
