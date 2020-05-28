package controller;

import aspect.Test;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Component("hello")
@RequestMapping("/user")
public class HelloWorld  implements TestHello {

    @RequestMapping("/hello")
    public void helloWorldHandler(){
        System.out.println("执行了hello方法");
    }
}
