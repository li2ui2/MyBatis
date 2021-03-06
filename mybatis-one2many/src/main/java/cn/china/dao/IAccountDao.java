package cn.china.dao;

import cn.china.domain.Account;
import cn.china.domain.AccountUser;

import java.util.List;

/**
 * @author LiWei
 * @date 2021/01/26 19:57
 * @description
 */
public interface IAccountDao {
    /**
     * 查询所有账户，同时还要获取到当前账户的所属用户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 查询所有账户，并且带有用户名称和地址信息
     * @return
     */
    List<AccountUser> findAllAccount();
}
