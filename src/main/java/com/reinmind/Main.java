package com.reinmind;

import com.reinmind.config.MybatisConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主启动类
 * @author xiang.zhang
 */
public class Main {

    public static void main(String[] args) {
        // Annotation Config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MybatisConfig.class);
        Application app = context.getBean(Application.class);

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Application app = context.getBean(Application.class);

//        app.connect();

        app.connect();
        context.close();
    }
}
