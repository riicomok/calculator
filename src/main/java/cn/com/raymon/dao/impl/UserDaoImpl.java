package cn.com.raymon.dao.impl;

import cn.com.raymon.dao.UserDao;
import cn.com.raymon.entity.DbUser;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Mo on 2016/1/10.
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao{

    public DbUser getDatabase(String username) {

        List<DbUser> users = internalDatabase();

        for (DbUser dbUser : users){
            if (dbUser.getUsername().equals(username) == true){
                return dbUser;
            }
        }
        throw new RuntimeException("用户不存在");
    }

    /**
     * 初始化数据
     * @return
     */
    public List<DbUser> internalDatabase() {

        List<DbUser> users = new ArrayList<DbUser>();
        DbUser user = null;

        user = new DbUser();
        user.setUsername("admin");

        //"admin"经过加密后
        user.setPassword("21232f297a57a5a743894a0e4a801fc3");
        user.setAccess(1);

        user = new DbUser();
        user.setUsername("user");

        //"user"经过加密后
        user.setPassword("ee11cbb19052e40b07aac0ca060c23ee");
        user.setAccess(2);

        users.add(user);

        return users;
    }
}
