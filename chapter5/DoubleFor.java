/**
 * 
 */
package chapter5;

/**
 * 双循环
 * @author Sebastian Gao
 *
 */
public class DoubleFor {

	public static void main(String[] args) {
		//行、列 - 双循环
		//外层循环控制行 控制行数，控制换行
		for (int i = 0; i < 4; i++) {//打印10行
			//内层循环控制列 控制列数、控制打印的符号
			for (int j = 0; j <= 2 - i; j++) {//每行打印3个空格
				System.out.print(" ");//只能打印符号，不要换行！
			}
			//打印完空格后，再打印星号：
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();//由外层循环控制的换行
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for (int i = 0; i < 5; i++) {//外层循环控制行
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//				if(j == 4) {
//					System.out.println();
//				}
//				
//			}
//			
//		}
	}

}
