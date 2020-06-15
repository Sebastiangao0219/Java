package chapter12;

import org.w3c.dom.ls.LSOutput;

/**
 * TODO:
 *
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-13 22:12
 */

public class DivisionDemo {
    public static void division(String strNum1, String strNum2) throws ArithmeticException, NumberFormatException{
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 / num2;
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        //who invoke, who deal with
        try {
            division("123","0");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}
