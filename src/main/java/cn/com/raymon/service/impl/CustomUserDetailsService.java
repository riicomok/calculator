package cn.com.raymon.service.impl;

import cn.com.raymon.dao.UserDao;
import cn.com.raymon.dao.impl.UserDaoImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by Mo on 2016/1/10.
 */
public class CustomUserDetailsService implements UserDetailsService {
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        public UserDao userDao = new UserDaoImpl();

        return null;
    }
}