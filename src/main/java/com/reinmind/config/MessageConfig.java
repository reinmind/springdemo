package com.reinmind.config;

import com.reinmind.service.MessageService;
import com.reinmind.service.impl.MessageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiang.zhang
 */
@Configuration
public class MessageConfig {
    @Bean
    public MessageService getMessageService(){
        return new MessageServiceImpl();
    }
}
