/**
 * 
 */
package chapter5;

/**
 * 
 * @author Sebastian Gao
 *
 */
public class DoubleFor1 {

	public static void main(String[] args) {
		char ch = 'A';
		for (int i = 0; i < 4; i++) {//打印10行
			//内层循环控制列 控制列数、控制打印的符号
			for (int j = 0; j <= (2 - i); j++) {//每行打印19个符号
				System.out.print(" ");//只能打印符号，不要换行！
			}
			//打印完井号后，再打印星号：
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print((char)ch);
			}
			ch++;
			System.out.println();//由外层循环控制的换行
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print((char)ch);
			}
			ch++;
			System.out.println();
		}
	}
}
