package com.sb.mb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.mb.dao.BigTextDao;
import com.sb.mb.dao.UserDao;
import com.sb.mb.model.BigText;
import com.sb.mb.model.UserDomain;
import com.sb.mb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-mybatis
 * @package: com.sb.mb.service.impl
 * @email: cy880708@163.com
 * @date: 2018/11/14 下午1:49
 * @mofified By:
 */
@Service (value = "userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Autowired
    private BigTextDao bigTextDao;

    @Override
    public int addUser(UserDomain user) {

        return userDao.insert(user);
    }

    @Override
    public int addBigText(BigText bigText) {

        return bigTextDao.insert(bigText);
    }

    /**
     * @description：这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2018/11/14 下午1:50
     * @mofified By:
     */
    @Override
    public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomain> userDomains = userDao.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

}
