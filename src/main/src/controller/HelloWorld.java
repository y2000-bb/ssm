package controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component("hello")
@RequestMapping("/user")
public class HelloWorld  implements TestHello {

    @RequestMapping("/hello")
    public void helloWorldHandler(){
        System.out.println("执行了hello方法");
    }
}
