package cn.china.dao;

import cn.china.domain.User;

import java.util.List;

/**
 * @author LiWei
 * @date 2021/01/18 15:40
 * @description 用户的持久层接口
 */
public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 更新用户信息
     * @param user
     */
    void updateUser(User user);

}
