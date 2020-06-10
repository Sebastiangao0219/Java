/**
 * 
 */
package chapter5;

/**
 * @author Sebastian Gao
 *
 */
public class SnakeNum {

	public static void main(String[] args) {
		for (int i = 0; i <= 8; i++) {//打印9行
			//内层循环控制列 控制列数、控制打印的符号
			for (int j = 0; j <= (8 - i); j++) {//每行打印19个符号
				System.out.print(" ");//只能打印符号，不要换行！
			}
			//打印完空格后，再打印星号：
			for (int j = 0; j <= 2 * i; j++) {
				System.out.println((int)(Math.pow(2,i)));
				}
			}
			System.out.println();//由外层循环控制的换行
		}
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= 8-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

}
