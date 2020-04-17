package com.company.project.common.api;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
*@author zizuo.zdh
*@Description 接口注解申明类
*@Date 2018/12/17 10:02
*@Param
*@return
*
**/
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {
    int value() default 1;
}
