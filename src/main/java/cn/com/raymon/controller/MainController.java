package cn.com.raymon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Riico on 2016/1/8.
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {

    /**
     * 跳转到calculator页面
     * @return
     */
    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String getAdminPage(){
        return "calculatorPage";
    }

    /**
     * 跳转到commonPage页面
     * @return
     */
    @RequestMapping(value = "/common", method = RequestMethod.GET)
    public String getCommonPage(){
        return "commonPage";
    }

}
