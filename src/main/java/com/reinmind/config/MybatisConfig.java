package com.reinmind.config;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiang.zhang
 */
@Configuration
@ComponentScan(value = {"com.reinmind"})
public class MybatisConfig {
    private static final Logger logger = LoggerFactory.getLogger(MybatisConfig.class);
    private static final String RESOURCE = "mybatis.xml";

    @Bean
    public SqlSessionFactory getSessionFactory(){
        try {
            InputStream inputStream = Resources.getResourceAsStream(RESOURCE);
            return new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            logger.error("获取mybatis配置失败");
        }
        logger.info("获取mybatis配置成功");
        return null;
    }

}
