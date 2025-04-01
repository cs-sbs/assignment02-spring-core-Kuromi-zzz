package org.example;

import org.example.config.AppConfig;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 创建Spring上下文
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

        // 获取UserService Bean
        UserService userService = context.getBean(UserService.class);

        // 测试添加和删除用户操作
        userService.addUser("张三");
        userService.deleteUser("张三");

        // 关闭上下文
        context.close();
    }
}