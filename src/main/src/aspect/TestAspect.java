package aspect;

//import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * 通知类
 */
@Component
public class TestAspect {

    public void before(){
        System.out.println("前置增强");
    }

    public void after(){
        System.out.println("后置通知");
    }


//    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("环绕前置通知");
//        proceedingJoinPoint.proceed();
//        System.out.println("环绕后置通知");
//    }
}
