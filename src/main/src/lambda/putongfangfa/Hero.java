package lambda.putongfangfa;

import lombok.Data;

@Data
public class Hero {

    private String name ;
    private float hp;
    private int damage;


    public Hero(String name){
        this.name = name;
    }

    public Hero(String name, float hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
}
