package cn.china;

import cn.china.dao.IUserDao;
import cn.china.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author LiWei
 * @data 2021/01/17 20:40
 * @description mybatis的入门案例
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        // 读取配置文件的两种方式：
        // 使用类加载器，它只能读取类路径的配置文件；
        // 使用ServletContext对象的getRealPath()方法
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        // 创建工厂mybatis使用了构建者模式，把对象的创建细节隐藏，是使用者直接调用方法即可拿
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in); // builder就是构建者
        //3.使用工厂生产SqlSession对象
        // 生产SqlSession使用了工厂模式，优势在于解耦，降低类之间的依赖关系
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        // 创建Dao接口实现类使用了代理，优势在于不修改远吗的基础上对已有方法增强
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}
