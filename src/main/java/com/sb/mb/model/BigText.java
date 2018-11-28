package com.sb.mb.model;

import java.io.Serializable;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-mybatis
 * @package: com.sb.mb.model、
 * @email: cy880708@163.com
 * @date: 2018/11/28 下午5:52
 * @mofified By:
 */
public class BigText implements Serializable {

    private String id;

    private String body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
