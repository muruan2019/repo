package com.company.project.common.api;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
*@author zizuo.zdh
*@Description TODO
*@Date 2018/12/17 10:12
*@Param
*@return
*
**/
public class ApiVersioningRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

  @Override
  protected RequestCondition<ApiVersionRule> getCustomTypeCondition(Class<?> handlerType) {
    ApiVersion apiVersion = AnnotationUtils.findAnnotation(handlerType, ApiVersion.class);
    return createCondition(apiVersion);
  }

  @Override
  protected RequestCondition<ApiVersionRule> getCustomMethodCondition(Method method) {
    ApiVersion apiVersion = AnnotationUtils.findAnnotation(method, ApiVersion.class);
    return createCondition(apiVersion);
  }

  private RequestCondition<ApiVersionRule> createCondition(ApiVersion apiVersion) {
    return apiVersion == null ? null : new ApiVersionRule(apiVersion.value());
  }
}
