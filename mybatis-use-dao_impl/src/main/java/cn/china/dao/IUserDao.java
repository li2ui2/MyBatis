package cn.china.dao;

import cn.china.domain.User;

import java.util.List;

/**
 * @author LiWei
 * @data 2021/01/17 20:15
 * @description 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有接口
     * @return
     */
    List<User> findAll();
}
