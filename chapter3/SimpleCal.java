package chapter3;

import java.util.Scanner;

/*
 * 
 */
public class SimpleCal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.定义变量：年，月，天数
		int year = -1, month = -1, dayOfMonth = -1;//初值给以永远不可能的值
		System.out.println("年份: ");
		year = input.nextInt();
		System.out.println("月份: ");
		month = input.nextInt();
		// 2.根据月份计算当月的天数。2月默认28天
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayOfMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dayOfMonth = 30;
			break;
		case 2:
			dayOfMonth = 28;
			break;
		default:
			System.out.println("只能输入1-12之间的整型数字！");
			System.exit(0);
		}
		
		
		// 3.如果输入的年份是闰年，月份天数+1
		boolean isLeapYear = year % 4 == 0 && year % 100 !=
0 || year % 400 == 0;
		if(isLeapYear) {
			dayOfMonth++;
		}
		System.out.println(year + "年" + month + "月有" + dayOfMonth + "天！");
	}

}
