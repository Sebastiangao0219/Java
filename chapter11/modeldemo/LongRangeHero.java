package chapter11.modeldemo;

/**
 * Long Range Attack Hero
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-11 00:38
 **/

public abstract class  LongRangeHero extends Hero {
    private int attackRange;

    public LongRangeHero(){
        super();
    }

    public LongRangeHero(long id, String name, int attackRange, int x, int y){
        super(id, name);
        setAttackRange(attackRange);
        setX(x);
        setY(y);
    }
    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }
}
