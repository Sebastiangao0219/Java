package chapter3;

import java.util.Scanner;

public class RMBConvert {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please input the number of money: ");
		double money = input.nextDouble();
		
		//deal with yuan
		int yuan = (int)money;
		int numOfShiYuan = yuan / 10; //number of 10
		int numOfWuYuan = yuan % 10 / 5;//number of 5
		int numOfYiYuan = yuan % 10 - 5;//number of 1
		//deal with jiao
		int jiao = ((int)(money * 10)) % 10;
		int numOfWuJiao = jiao / 5;
		int numOfYiJiao = jiao -5;
		
		System.out.println("number of 10: " + numOfShiYuan);
		System.out.println("number of 5: " + numOfWuYuan);
		System.out.println("number of 1: " + numOfYiYuan);
		System.out.println("number of 0.5: " + numOfWuJiao);
		System.out.println("number of 0.1: " + numOfYiJiao);
		
	}

}
