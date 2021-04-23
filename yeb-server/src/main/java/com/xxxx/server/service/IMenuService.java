package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanglishen
 * @since 2021-04-14
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> getMenusByAdminId();

    //根据角色查询菜单
    List<Menu> getMenusWithRole();

    List<Menu> getAllMenus();
}
