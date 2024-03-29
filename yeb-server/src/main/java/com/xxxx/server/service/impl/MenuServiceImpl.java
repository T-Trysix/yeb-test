package com.xxxx.server.service.impl;

import com.xxxx.server.
        pojo.Admin;
import com.xxxx.server.
        pojo.Menu;
import com.xxxx.server.mapper.MenuMapper;
import com.xxxx.server.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanglishen
 * @since 2021-04-14
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenusByAdminId() {
        return menuMapper.getMenusByAdminId(((Admin)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    /**
     * 根据角色查询菜单列表
     * @return
     */
    @Override
    public List<Menu> getMenusWithRole() {
        return menuMapper.getMenusWithRole();
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }
}
