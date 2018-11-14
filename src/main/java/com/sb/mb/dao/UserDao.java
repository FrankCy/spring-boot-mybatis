package com.sb.mb.dao;

import com.sb.mb.model.UserDomain;

import java.util.List;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-mybatis
 * @package: com.sb.mb.dao
 * @email: cy880708@163.com
 * @date: 2018/11/14 下午1:46
 * @mofified By:
 */
public interface UserDao {

    int insert(UserDomain userDomain);

    List<UserDomain> selectUsers();

}
