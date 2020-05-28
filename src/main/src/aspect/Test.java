package aspect;

import controller.TestHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestHello helloWorld =(TestHello)applicationContext.getBean("hello");
        helloWorld.helloWorldHandler();
    }
}
