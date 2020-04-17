package com.company.project.common.api;

import org.springframework.web.servlet.mvc.condition.RequestCondition;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zizuo.zdh
 * @ClassName ApiVersionRule
 * @Description TODO
 * @Date 2018/12/17 10:03
 * @Version 1.0
 **/
public class ApiVersionRule implements RequestCondition<ApiVersionRule> {
    private final static Pattern VERSION_PREFIX_PATTERN = Pattern.compile("/v(\\d+).*");
    private int apiVersion;

    ApiVersionRule(int apiVersion) {
        this.apiVersion = apiVersion;
    }

    public int getApiVersion() {
        return apiVersion;
    }

    @Override
    public ApiVersionRule combine(ApiVersionRule apiVersionRule) {
        return new ApiVersionRule(apiVersionRule.getApiVersion());
    }

    @Override
    public ApiVersionRule getMatchingCondition(HttpServletRequest httpServletRequest) {
        Matcher m = VERSION_PREFIX_PATTERN.matcher(httpServletRequest.getRequestURI());
        if (m.find()) {
            Integer version = Integer.valueOf(m.group(1));
            if (version == this.apiVersion) {
                return this;
            }
        }
        return null;
    }

    @Override
    public int compareTo(ApiVersionRule apiVersionRule, HttpServletRequest httpServletRequest) {
        return apiVersionRule.getApiVersion() - this.apiVersion;
    }


}
