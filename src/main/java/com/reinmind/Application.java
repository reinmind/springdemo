package com.reinmind;

import com.reinmind.bean.Message;
import com.reinmind.mapper.MessageMapper;
import com.reinmind.service.MessageService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author xiang.zhang
 */
@Component
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Resource
    private MessageService messageService;

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String target,String msg){
        messageService.send(target,msg);
    }

    public void connect(){
        try (SqlSession session = sqlSessionFactory.openSession()){
//            Message message = session.selectOne("com.reinmind.mapper.MessageMapper",1);
            MessageMapper messageMapper = session.getMapper(MessageMapper.class);
            Message message = messageMapper.queryMessage();
            System.out.println(message);
        }
        logger.info("链接获取成功");
    }

}
