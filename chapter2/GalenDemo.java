package chapter2;

import java.util.Scanner;

public class GalenDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("生命值： ······");
		System.out.println("物理攻击： ······");
		System.out.println("技能伤害： ······");
		double attack = 57.88; //harm
		double attackGrowth = 4.5;
		System.out.print("伤害:");
		attack = input.nextDouble();
		System.out.print("伤害成长值:");
		attackGrowth = input.nextDouble();
		
		
		System.out.printf("\n伤害：%.2f(+%.2f)\n",attack,attackGrowth);
	}
}
