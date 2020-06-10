/**
 * 
 */
package chapter6;

import java.util.Scanner;

/**
 * 要求用户动态录入5个学生的成绩，求平均成绩
 * @author Sebastian Gao
 *
 */
public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		double sum = 0, avg; //总成绩和平均成绩
		for(int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) +"位同学的成绩:");
			//将用户输入的double类型数字，赋值给数组中的第i个元素
			scores[i] = input.nextDouble();//重点语句！
		}
		//打印录入的元素
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//			
//		}
		//计算总成绩
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; //经典代码
		}
		System.out.printf("%d位同学的平均成绩位：%.2f", scores.length, sum / scores.length);
	}

}
