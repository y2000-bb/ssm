package aopandinterface;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyFirstAnnotation {

    String value() default "隔壁老王";


}
