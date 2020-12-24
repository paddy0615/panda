package com.example.panda.controller;

import com.example.panda.bean.RestResultModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * api控制器
 * paddy 2020-12-24
 * */
@Controller
@RequestMapping(value = "api")
public class ApiController {
    private static Logger logger = LoggerFactory.getLogger(ApiController.class);


    /**
     * test
     */
    @ResponseBody
    @RequestMapping("/tset")
    public RestResultModule tset(@RequestParam(name = "phone", defaultValue = "", required = true) String phone
    ) {
        RestResultModule module = new RestResultModule();
        String responseTxt = "" + phone;
        try {
            System.out.println(responseTxt);
        } catch (Exception e) {
            logger.error(e.toString());
            module.setSuccess(false);
        }
        return module;
    }


    /**
     * 登录接口
     */
    @ResponseBody
    @RequestMapping("/loginphone")
    public RestResultModule loginphone(@RequestHeader(name = "token", defaultValue = "", required = true) String token,
                                       @RequestParam(name = "phone", defaultValue = "", required = true) String phone,
                                       @RequestParam(name = "password", defaultValue = "", required = true) String password,
                                       @RequestParam(name = "language", defaultValue = "", required = false) String language) {
        RestResultModule module = new RestResultModule();
        String responseTxt = "" + token + "," + phone + "," + password + "," + language;
        try {
            System.out.println(responseTxt);

        } catch (Exception e) {
            logger.error(e.toString());
            module.setSuccess(false);
        }
        return module;
    }

}
