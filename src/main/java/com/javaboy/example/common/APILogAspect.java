package com.javaboy.example.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(1)
public class APILogAspect {

    //定义切点
    @Pointcut("execution(public * com.javaboy.example.api.ApiController.*(..))")
    public void apiLog() {
    }

    //前置增强
    @Before("apiLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("this is before");
        System.out.println("@Before：模拟权限检查...");
        System.out.println("@Before：目标方法为：" +
                joinPoint.getSignature().getDeclaringTypeName() +
                "." + joinPoint.getSignature().getName());
        System.out.println("@Before：参数为：" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("@Before：被织入的目标对象为：" + joinPoint.getTarget());
    }

    //后置增强
    @AfterReturning(value = "apiLog()", returning = "returnValue")
    public void doAfterReturning(JoinPoint point,Object returnValue) throws Throwable {
        System.out.println("this is after");
        System.out.println("@AfterReturning：模拟日志记录功能...");
        System.out.println("@AfterReturning：目标方法为：" +
                point.getSignature().getDeclaringTypeName() +
                "." + point.getSignature().getName());
        System.out.println("@AfterReturning：参数为：" +
                Arrays.toString(point.getArgs()));
        System.out.println("@AfterReturning：返回值为：" + returnValue);
        System.out.println("@AfterReturning：被织入的目标对象为：" + point.getTarget());
    }
    //环绕增强
    @Around("apiLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("@Around：执行目标方法之前...");
        //访问目标方法的参数：
//        Object[] args = joinPoint.getArgs();
//        if (args != null && args.length > 0 && args[0].getClass() == String.class) {
//            args[0] = "改变后的参数1";
//        }
        //用改变后的参数执行目标方法
        Object returnValue = joinPoint.proceed();
        System.out.println("@Around：执行目标方法之后...");
        System.out.println("@Around：被织入的目标对象为：" + joinPoint.getTarget());
        System.out.println("原返回值：" + returnValue + "，这是返回结果的后缀");
        //如果选择在环绕增强
        //不然请求完接口后返回信息为空
        return returnValue;
    }
}
