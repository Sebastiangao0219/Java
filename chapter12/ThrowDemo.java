package chapter12;

import javax.swing.*;

/**
 * TODO:Throw Exception manually
 *
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-13 22:20
 */

public class ThrowDemo {
    public static void main(String[] args) {
        Hero president = new Hero("Biden");
        try {
            president.setExp(-9);
        } catch (Exception e) {
            //e.printStackTrace();
            System.err.println("Exception happened when set Exp: " + e.getMessage());
        }
        System.out.println("Current Exp of the president is: " + president.getExp());

    }
}

class Hero{
    private String name;
    private long exp;

    public Hero(String name){
        setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) throws Exception {
        if(exp >= 0)
            this.exp = exp;
        else
            throw new Exception("Exp cannot less than 0!");//we don't tackle from here, we let whom who call it, who deal with it
    }
}
