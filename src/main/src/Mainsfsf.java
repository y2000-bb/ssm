import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import staticproxy.impl.DogDaoImpl;

/**
 * 测试bean的声明周期及bean的作用域
 */
public class Mainsfsf {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DogDaoImpl dpg = (DogDaoImpl)applicationContext.getBean("ss");

        dpg.setName("哈士奇");
        System.out.println(dpg.toString());
        DogDaoImpl dpg3 = (DogDaoImpl)applicationContext.getBean("ss");
        System.out.println(dpg3.toString());
        System.out.println("通过BeanFactory的实现类XmlBeanFactory获取ioc容器 为懒加载方式");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        DogDaoImpl dpg2 = (DogDaoImpl) xmlBeanFactory.getBean("ss");
        System.out.println(dpg2.toString());


    }
}
