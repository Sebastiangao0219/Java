/**
 * 
 */
package chapter5;

/**
 * @author Sebastian Gao
 *
 */
public class DoubleFor2 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {//打印10行
			//内层循环控制列 控制列数、控制打印的符号
			for (int j = 0; j <= 2 - i; j++) {//每行打印19个符号
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				if(j == 0 || j == 2 * i) {//j是最大值或最小值的时候，打印“*”
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
				System.out.println();//由外层循环控制的换行
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(" ");
				}
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if(j == 0 || j == 4 - 2 * i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			}
	}
}

