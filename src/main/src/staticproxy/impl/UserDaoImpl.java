package staticproxy.impl;

import staticproxy.PetDao;

public class UserDaoImpl implements PetDao {
    private  DogDaoImpl dao ;


    public UserDaoImpl(PetDao petDao){
        if(petDao.getClass()==DogDaoImpl.class){
            this.dao=(DogDaoImpl) petDao;
        }
    }
    public void run() {
        System.out.println("人抱着狗跑开腿跑");
    }
}
