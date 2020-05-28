package testproxy;

import staticproxy.PetDao;
import staticproxy.impl.DogDaoImpl;
import staticproxy.impl.UserDaoImpl;
import testproxy.impl.DogDaoProxyImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 静态代理， 要点：（1.被代理的类   2.代理类  前面两个类必须实现同一个接口）
 * 公司工作氛围很好，工作环境也不错，
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        PetDao dogDao = new DogDaoImpl();
        InvocationHandler invocationHandler  = new DogDaoProxyImpl<PetDao>(dogDao);
        PetDao dao = (PetDao) Proxy.newProxyInstance(dogDao.getClass().getClassLoader(),dogDao.getClass().getInterfaces(),invocationHandler);
        dao.run();
    }
}
