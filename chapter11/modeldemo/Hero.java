package chapter11.modeldemo;

/**
 * Super Class, Class of Hero
 *
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-10 21:03
 **/

public abstract class Hero {
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
    /**
     * 使用模板模式实现的对战方法
     * 规定了默认情况下的对战流程
     * @Param: hero
     * @Return:
    **/

    public void PK(Hero hero) {
        //1.calculate distance to see if close enough to attack each other
        if(isFightByDistance(hero) && hp > 0 && hero.getHp() > 0){
            //2.fight if close enough
            fight(hero);
        }else{
            System.out.println("\nAttack failed due to distance or other reasons!");
        }
        //3.print result after fight in the console
        System.out.println("Current state of the two hero");
        System.out.println("NickName\tHP\tX\tY");
        System.out.println(name + "\t\t" + hp + "\t" + x + "\t" + y);
        System.out.printf("%s\t\t%d\t%d\t%d",
                hero.getName(), hero.getHp(), hero.getX(),hero.getY());

    }

    /**
     * @Param: hero, the attack object
     * @Return: if can be attack
     * to see if the current hero can attack the passed hero
     **/
    public abstract boolean isFightByDistance(Hero hero);

    /**
     * attack the passed hero, minus hp according to the random attack by default
     *
     * @Param: hero
     * @Return:
     **/

    public abstract void fight(Hero hero);

    /**
     * using protected, we hope subclass can implement it
     * @Param:
     * @Return: distance of two coordinates
    **/
    
    protected double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2));
        
    }

    /**
     * @Param:
     * @Return: shortcut for getters and setters: command + N
     **/
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

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 0 || level > 100) {
            this.level = 1;
        } else {
            this.level = level;
        }

    }
}
