package chapter11.modeldemo;

/**
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-11 00:20
 * shortcuts: sout for print, psvm for main, fori for for loop, iter for for each.
 **/

public class HeroTest {
    public static void main(String[] args) {//shortcut, psvm + enter
        //fight between two warriors
        Hero hero1 = new Warrior(1, "Trump", 0, 0);
        Hero hero2 = new Warrior(2, "Biden", 50, 50);
        hero1.PK(hero2);
        hero2.PK(hero1);
        //System.out.println();

        Hero hero3 = new Magical(3, "Obama", 500, 250, 250);
        hero3.PK(hero1);// Obama fight Trump
        hero1.PK(hero3);//Trump fight Obama
    }

}
