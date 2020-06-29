package genericparadigm.test;

import genericparadigm.entity.Demo1;
import genericparadigm.entity.Demo2;
import genericparadigm.entity.IDemo;

import java.lang.reflect.Field;

public class Test {



    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Demo1<String> demo1 = new Demo1<String>("123");
                          demo1.printss(1,2,"3",4,5,6);
    }
}
