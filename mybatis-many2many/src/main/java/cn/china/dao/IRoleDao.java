package cn.china.dao;

import cn.china.domain.Role;

import java.util.List;

/**
 * @author LiWei
 * @date 2021/02/19 15:59
 * @description 角色实体类接口
 */
public interface IRoleDao {
    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();
}
