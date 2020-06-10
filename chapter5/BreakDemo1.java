/**
 * 
 */
package chapter5;

import java.util.Scanner;

/**
 * 统计玩家的个人贡献度，遇到负值，直接跳出循环
 * @author Sebastian Gao
 *
 */
public class BreakDemo1 {

	public static void main(String[] args) {
		int exp = 0;
		int sum = 0;
		for(;;) {//死循环
			System.out.println("请输入本次的贡献度：");
			exp = new Scanner(System.in).nextInt();//匿名的方式调用对象方法
			if(exp < 0) {
				System.out.println("个人贡献度不能为负数，程序强制退出！");
				break;
			}
			sum += exp;
		}
		System.out.println("您输入的贡献度总数为: " + sum);
	}

}
