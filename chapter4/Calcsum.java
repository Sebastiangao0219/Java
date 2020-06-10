package chapter4;

import java.util.Scanner;

/*
 * 计算输入的整型数字中每位数字之和
 */
public class Calcsum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字，我来计算各位之和: ");
		//1.得到要计算的整型数字
		//int num = 54321;//要进行拆分计算的整型数字
		int num = input.nextInt();
		int tempNum = num;
		//2.声明相关变量
		int i = 0;//循环变量
		int sum = 0;//累加和
		//3.循环操作计算累加和
		//54321 % 10 / 10
		while(tempNum > 0) {
			sum += tempNum % 10;
			tempNum /= 10;
		}
		//4.打印计算结果
		System.out.println(num + " 的各位数字之和为: " + sum);

	}

}
