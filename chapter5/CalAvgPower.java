/**
 * 
 */
package chapter5;

import java.util.Scanner;

/**
 * 求游戏工会玩家的平均战斗力
 * @author Sebastian Gao
 *
 */
public class CalAvgPower {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int power = 0;//玩家战斗力
		int sum = 0;
		double avg = 0;//平均值
		//输入三个战力，求平均值
		for(int i = 0; i < 3; i++) {
			System.out.println("请输入第" + (i + 1) +"位玩家战斗力");
			power = input.nextInt();
			sum += power;
		}
		avg = sum / 3.0;
		System.out.printf("三位玩家的战斗力平均值为: %.2f\n", avg);
		//强烈建议：一个循环最好只做一件事
		//在以后学习数组后，使用单独的循环求战力之和
		
		
	}

}
