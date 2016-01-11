package cn.com.raymon.dao;

import cn.com.raymon.entity.DbUser;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Mo on 2016/1/10.
 */
public interface UserDao {

    DbUser getDatabase(String username);

}
