package chapter11.modeldemo;

/**
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-11 15:59
 **/

public class Magical extends LongRangeHero {
    public Magical() {
        super();
    }

    public Magical(long id, String name, int attackRange, int x, int y){
        super(id, name, attackRange, x, y);
    }

    @Override
    public boolean isFightByDistance(Hero hero) {
        double distance = getDistance(this.getX(), this.getY(), hero.getX(), hero.getY());
        if(Math.abs(distance) <= getAttackRange()){//if in the range of attack
            return true;
        }
        System.out.println("Target too far to attack!");
        return false;
    }

    @Override
    public void fight(Hero hero) {
        // Attack Range on magician is kinda far, so we set the attack lower
        setAttack((int)Math.round(Math.random() * 5) + 5);
        hero.setHp(hero.getHp() - getAttack());
        System.out.println("\n" + getName() + " did a long-range fight successfully!");
    }
}
