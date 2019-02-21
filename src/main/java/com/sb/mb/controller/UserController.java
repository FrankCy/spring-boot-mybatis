package com.sb.mb.controller;

import com.sb.mb.model.BigText;
import com.sb.mb.model.UserDomain;
import com.sb.mb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-mybatis
 * @package: com.sb.mb.controller
 * @email: cy880708@163.com
 * @date: 2018/11/14 下午1:51
 * @mofified By:
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @description：新增用户信息x
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2018/11/14 下午1:52
     * @mofified By:
     */
    @ResponseBody
    @RequestMapping(value = "/add")
    public int addUser(UserDomain user){
//        return userService.addUser(user);
        return 1;
    }

    /**
     * @description：查询数据库所有信息
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2018/11/14 下午1:52
     * @mofified By:
     */
    @ResponseBody
    @GetMapping(value = "/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }


    /**
     * @description：创建6万字节的数据往数据库中写
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2018/11/14 下午1:52
     * @mofified By:
     */
    @ResponseBody
    @RequestMapping(value = "/addBody")
    public int addBody(BigText bigText){
        byte[] b = new byte[60000];
        String body = new String(b);
        bigText.setBody(body);
        return userService.addBigText(bigText);
    }
}
