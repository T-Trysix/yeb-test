package com.xxxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.server.pojo.Department;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zhanglishen
 * @since 2021-04-14
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    List<Department> getAllDepartmentsByParentId(int i);

    void addDep(Department dep);

    void deleteDep(Department department);

}
