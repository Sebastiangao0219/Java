package chapter11.modeldemo.pkgame;

/**
 * to simulate a core logical codes of a game
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-11 23:20
 */

public class AppMain {
    public static void main(String[] args) {
        Hero hero1 = new Warrior(1, "Trump", 0, 0);
        Castle castle = new Castle("The White House", 10, 10, 750);

        hero1.PK(castle);
    }
}
