package chapter11.modeldemo;

/**
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-10 23:50
 **/

public class Warrior extends Hero {
    public Warrior(){
        super();
        setName("Hero By Default");
    }

    public Warrior(long id, String name, int x, int y){
        super(id, name);
        setX(x);
        setY(y);
    }

    @Override
    public boolean isFightByDistance(Hero hero) {
        double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
        //assume the attack distance of warrior is 100
        return distance <= 100;
    }

    @Override
    public void fight(Hero hero) {
        //1.generate random attack
        //2.minus the hp of passed hero
        int attack = ((int)(Math.random() * 50)) + 20;//attack is between 20-70
        setAttack(attack);
        hero.setHp(hero.getHp() - attack);
        System.out.println("\n" + getName() + " did a close fight successfully!");

    }
}
