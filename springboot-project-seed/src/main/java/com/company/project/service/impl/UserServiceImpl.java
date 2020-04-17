package com.company.project.service.impl;

import com.company.project.mapper.UserMapper;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.company.project.core.AbstractService;
import com.company.project.common.log.XlyLogger;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by muruan on 2020/04/16.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {

    private static Logger logger = XlyLogger.get();

    @Resource
    private UserMapper userMapper;

}
