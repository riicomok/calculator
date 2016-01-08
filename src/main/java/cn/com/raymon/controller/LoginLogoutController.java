package cn.com.raymon.controller;

import cn.com.raymon.service.LoginService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by Riico on 2016/1/7.
 */
@RequestMapping(value = "/auth")
public class LoginLogoutController {

    @Resource
    private LoginService loginService;

    /**
     *
     * @param error
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage(
            @RequestParam(value = "error", required = false)
            boolean error, ModelMap modelMap) {

        if (error == true) {
            modelMap.put("error", "密码不正确");
        } else {
            modelMap.put("error", "");
        }
        return "loginPage";
    }

    public String getDeniedPage(){
        return "deniedPage";
    }

}
