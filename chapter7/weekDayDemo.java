/**
 * 
 */
package chapter7;

import java.util.Scanner;

/**
 * 书写方法，将数字星期转换为文字版并输出
 *  
 * @author Sebastian Gao
 *
 */
public class weekDayDemo {
	

	public static void main(String[] args) {
		System.out.println("Pls input the day of the week: ");
		int dayOfWeek = new Scanner(System.in).nextInt();
		//Chinese
		ShowWeekDayByChinese(dayOfWeek - 1);
		//Japanese
		ShowWeekDayByJapanese(dayOfWeek - 1);
		//English
		ShowWeekDayByEnglish(dayOfWeek - 1);
	}
	/*
	 *  用来判断传入的参数是否在1-7之间
	 *  @return 如果合法，返回true，非法，返回false
	 */
	private static boolean isRight(int dayOfWeek) {
		if(dayOfWeek < 1 || dayOfWeek > 7) {
			//System.out.println("number has to between 1 to 7");
			return false;
		}
		return true; 
	}
	/*
	 * dayOfWeek shows in Chinese
	 * @param dayOfWeek integer from 1 - 7 to show day of the week
	 */
	public static void ShowWeekDayByChinese(int dayOfWeek) {
		if(!isRight(dayOfWeek)) {
			System.out.println("number has to between 1 to 7");
			return;
		}
		String[] weekdays = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
		System.out.println(weekdays[dayOfWeek]);
	}
	static void ShowWeekDayByJapanese(int dayOfWeek) {
		if(!isRight(dayOfWeek)) {
			System.out.println("number has to between 1 to 7");
			return;
		}
		String[] weekdays = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
		System.out.println(weekdays[dayOfWeek]);
	}
	static void ShowWeekDayByEnglish(int dayOfWeek) {
		if(!isRight(dayOfWeek)) {
			System.out.println("number has to between 1 to 7");
			return;
		}
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		System.out.println(weekdays[dayOfWeek]);
	}

}
