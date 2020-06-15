package chapter11.modeldemo.pkgame;

/**
 * implemented Hero class of assailable interface,
 * also an abstract class similar as before
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-11 22:41
 **/

public abstract class Hero implements Assailable {
    private long id;
    private String name;
    private int level;
    private int maxHp;
    private int hp;
    private int attack;
    private int x;
    private int y;

    public Hero() {
        setMaxHp(100);
        setHp(100);
    }

    public Hero(long id, String name) {
        this();//call it's own constructor which mean we have MaxHp and Hp already.
        setId(id);
        setName(name);
    }

    protected double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    /**
     * PK between heros
     * 1. estimate the distance between 2 heros
     * 2. attack while distance satisfied
     * @Param:
     * @Return:
    **/
    public void PK(Assailable assa){
        if(isFightByDistance(assa) && hp > 0 && assa.getHp() > 0){
            fight(assa);
        }else{
            System.out.println("\nAttack failed due to distance or other reasons!");
        }
        //3.print result after fight in the console
        System.out.println("Current state of the two hero");
        System.out.println("NickName\t\t\tHP\tX\tY");
        System.out.println(name + "\t\t\t\t" + hp + "\t" + x + "\t" + y);
        System.out.printf("%s\t\t%d\t%d\t%d",
                assa.getName(), assa.getHp(), assa.getX(),assa.getY());

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
