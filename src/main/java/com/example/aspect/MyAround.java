package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: dangdang_xpj
 * @Package: com.example.aspect
 * @ClassName: MyArround
 * @Author: xpj
 * @Date: 2021/5/11 上午 9:02
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
@Component
@Aspect
public class MyAround {
    @Around("execution(* com.example.controller.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("-----进入环绕通知-----");
        String className = joinPoint.getTarget().getClass().getName();
        System.err.println("className = " + className);
        String methodName = joinPoint.getSignature().getName();
        System.err.println("methodName = " + methodName);
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        Object proceed = joinPoint.proceed();
        System.out.println("-----环绕通知结束-----");
        return proceed;
    }
}
