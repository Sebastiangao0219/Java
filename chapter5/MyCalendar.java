/**
 * 
 */
package chapter5;

/**
 * @author Sebastian Gao
 *
 */
public class MyCalendar {

	public static void main(String[] args) {
		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
		System.out.print("\t");
		//System.out.println("\t1\t2\t3\t4\t5\t6");
		int dayOfMonth = 31;
		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.print(i);
			//判断何时\t,何时\n(周日那天)
			//已知：1号是星期二
			if((i + 1) % 7 == 0) {
				System.out.print("\n");
			}else {
				System.out.print("\t");
			}
			
			
		}

	}

}
