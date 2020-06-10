package chapter4;
/*
 * 
 */
public class CalcMoney {

	public static void main(String[] args) {
		 //确定循环三要素
		int year = 2015; //年份
		double money = 800;
		while(money <= 2000) {
			year++;
			money *= 1.25;
		}
		String str = String.format("%d年，交易额达到2000亿(%.2f亿元)",year, money);
		/*System.out.println(year + "年，交易额达到2000亿(" + money +"元）");*/
		System.out.println(str);
	}

}
