package ioc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student  =  (Student)applicationContext.getBean("student");
        System.out.println(student.getPhone().toString());
        System.out.println(student.toString());
    }
}
