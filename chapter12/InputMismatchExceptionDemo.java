package chapter12;

import java.util.Scanner;

/**
 * TODO:Input Unmatch Exception Instance
 * The number that user input can only be type int
 * deal with it with try catch and tackle the Exception
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-13 19:44
 */

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input age(it has to be an int): ");
        int age = 0;
        try {
            age = input.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("The age you input is: " + age);
    }
}
