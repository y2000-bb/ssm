package genericparadigm.entity;

import genericparadigm.inter.TestInterface;

public class Demo2 implements TestInterface<String> {


    public String s(){
        System.out.println("demo222");
        return "demo222";
    }
    public String text() {

        return null;
    }



}
