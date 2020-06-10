/**
 * 
 */
package chapter7;

import java.util.Scanner;

/**
 * @author Sebastian Gao
 *
 */
public class PrintCalendar {
	//用户输入的年份
	public static int year = Integer.MIN_VALUE;
	//用户输入的月份
	public static int month = Integer.MIN_VALUE;
	public static void main(String[] args) {
		PrintCalendar();
	}
	/*
	 *  打印月历的核心方法
	 */
	public static void PrintCalendar() {
		//1.让用户输入年份和月份
		InputYearAndMonth();
		//2.计算1900-1-1到用户输入年份月份的总天数（year = 2017, month = 7
		// 2017-7-1)
		//  2-1. 计算各年的总天数
		//  2-2. 计算各月的天书之和
		int sum = getSumDayOfYears();
		sum += getSumDayOfMonth();
		//sum++;
		//3.打印年份和月份
		printMonthTitle();
		//4.打印月份的标题（星期一到星期日）
		//5.根据某月1日是星期几，打印月历内容
	}
	private static void printMonthTitle() {
		String[] monthNames = {"January", "Feburary", "March", "April", "May", 
				"June", "July", "August", "September", "October", "November", "December"};
		System.out.println("\t\t" + year + "\t" + monthNames[month - 1]);
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for (int i = 0; i < weekdays.length; i++) {
			System.out.println(weekdays[i] + "\t");
		}
		System.out.println();
	}
	/*
	 * 获得1900-year年的总天数
	 */
	private static int getSumDayOfYears() {
		//需要判断用户是否已经输入了年份
		if(year == Integer.MIN_VALUE) {
			System.out.println("Year wrong! Please reinput year and month!");
			InputYearAndMonth();
		}
		int sum = 0;
		for(int i = 1990; i < year; i++) {
			sum += 365; //每一年累加365天
			if(isLeapYear(i)) {
				sum++;//闰年多加1天
			}
		}
		return sum;
	}
	private static int getSumDayOfMonth() {
		int sum = 0;
		int[] dayOfMonth = {31, 28 , 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < month - 1; i++) {
			sum += dayOfMonth[i];
		}
		//如果year是闰年，并且month >= 3   sum++
		if(isLeapYear(year) && month >= 3) {
			sum++;
		}
		return sum;
	}
	
	/*
	 * 用来判断传入的year变量是不是闰年
	 * @param year要判断的年份
	 * @return 是闰年，返回true
	 */
	private static boolean isLeapYear(int year) {
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
	/*
	 * 接收用户输入的年份和月份
	 */
	private static void InputYearAndMonth() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input year: ");
		year = input.nextInt();
		System.out.println("Please input month: ");
		month = input.nextInt();
		input.close();//关闭对象
		input = null;//销毁  节省资源   专业做法
	}

}
