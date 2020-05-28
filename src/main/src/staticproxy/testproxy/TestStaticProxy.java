package staticproxy.testproxy;

import staticproxy.PetDao;
import staticproxy.impl.DogDaoImpl;
import staticproxy.impl.UserDaoImpl;

/**
 * 静态代理， 要点：（1.被代理的类   2.代理类  前面两个类必须实现同一个接口）
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        PetDao dogDao = new DogDaoImpl();
        PetDao UserDaoImpl = new UserDaoImpl(dogDao);
        UserDaoImpl.run();
    }
}
