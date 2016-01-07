package cn.com.raymon.action;

import cn.com.raymon.entity.User;
import cn.com.raymon.service.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Riico on 2016/1/7.
 */
@RequestMapping(value = "/login")
public class LoginAction {

    @Resource
    private LoginService loginService;

    public void login(String account, String password){



    }

}
