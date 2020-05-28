package staticproxy.impl;

import staticproxy.PetDao;

public class DogDaoImpl implements PetDao {

    private String name;

    @Override
    public String toString() {
        return "DogDaoImpl{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DogDaoImpl(){
        System.out.println("构造器被调用");
    }

    public void run() {
        System.out.println("狗子疯狂的跑");
    }


    public void production(){
        System.out.println("小狗出生了");
    }
    public void sleep(){
        System.out.println("小狗睡着了");
    }
}
