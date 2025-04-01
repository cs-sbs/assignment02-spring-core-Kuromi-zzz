package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.example.service.UserService.*(..))")
    public void beforeMethodExecution(JoinPoint joinPoint) {
        System.out.println("=== 操作开始时间: " + LocalDateTime.now() + " ===");
        System.out.println("执行方法: " + joinPoint.getSignature().getName());
        System.out.println("方法参数: " + java.util.Arrays.toString(joinPoint.getArgs()));
    }

    @After("execution(* org.example.service.UserService.*(..))")
    public void afterMethodExecution(JoinPoint joinPoint) {
        System.out.println("=== 操作结束时间: " + LocalDateTime.now() + " ===");
        System.out.println("----------------------------------------");
    }
} 