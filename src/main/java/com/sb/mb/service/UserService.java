package com.sb.mb.service;

import com.github.pagehelper.PageInfo;
import com.sb.mb.model.BigText;
import com.sb.mb.model.UserDomain;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-mybatis
 * @package: com.sb.mb.service
 * @email: cy880708@163.com
 * @date: 2018/11/14 下午1:49
 * @mofified By:
 */
public interface UserService {

    int addUser(UserDomain user);

    int addBigText(BigText bigText);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);

}
