package lambda.lambdashixian;

import lambda.nimingleibulei.HeroChecker;
import lambda.putongfangfa.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * 普通方法实现过滤
 */
public class TestLambda {


    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();


        List<Hero> list  = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            Hero hero = new Hero("hero "+i, random.nextInt(1000),random.nextInt(100));
            list.add(hero);
        }
        System.out.println("初始化后的集合："+list.toString());
        System.out.println("筛选后的结果：");
        System.out.println("筛选出hp》100 并且攻击《50的英雄");


        filter(list,h->h.getHp()>100 && h.getDamage()<50);

    }



    private static  void filter(List<Hero> list,HeroChecker heroChecker){
        for (Hero hero : list) {
            if(heroChecker.test(hero)){
                System.out.println(hero);
            }
        }
    }

}


