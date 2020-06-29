package aspect;

//import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.beans.Expression;
import java.lang.annotation.Annotation;

/**
 * 通知类
 */
@Component
@Aspect
public class TestAspect {
    @Pointcut("@annotation(aopandinterface.MyFirstAnnotation)")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(){
        System.out.println("前置增强");
    }

    public void after(){
        System.out.println("后置通知");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long beginTime = System.currentTimeMillis();
        System.out.println("方法开始执行");
        proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long time = endTime - beginTime;
        System.out.println("方法执行完成，执行时间为"+time);
    }


//    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("环绕前置通知");
//        proceedingJoinPoint.proceed();
//        System.out.println("环绕后置通知");
//    }
}
