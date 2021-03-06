package cn.china.dao.impl;

import cn.china.dao.IUserDao;
import cn.china.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.sql.SQLData;
import java.util.List;

/**
 * @author LiWei
 * @date 2021/01/17 22:15
 * @description 接口实现类
 */
public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<User> findAll(){
        //1.使用工厂创建SqlSession对象
        SqlSession session = factory.openSession();
        //2.使用session执行查询所有方法
        List<User> users = session.selectList("cn.china.dao.IUserDao.findAll");
        session.close();
        //3.返回查询结果
        return users;
    }
}
