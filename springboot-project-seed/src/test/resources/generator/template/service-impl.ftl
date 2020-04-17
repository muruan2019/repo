package ${basePackage}.service.impl;

import ${basePackage}.mapper.${modelNameUpperCamel}Mapper;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.service.${modelNameUpperCamel}Service;
import ${basePackage}.core.AbstractService;
import ${basePackage}.common.log.XlyLogger;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by ${author} on ${date}.
 */
@Service
@Transactional
public class ${modelNameUpperCamel}ServiceImpl extends AbstractService<${modelNameUpperCamel}> implements ${modelNameUpperCamel}Service {

    private static Logger logger = XlyLogger.get();

    @Resource
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

}
