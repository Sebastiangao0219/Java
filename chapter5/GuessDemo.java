/**
 * 
 */
package chapter5;

import java.util.Scanner;

/**
 * 才数字游戏
 * @author Sebastian Gao
 *
 */
public class GuessDemo {

	public static void main(String[] args) {
		//用户要猜的数字
		//用户猜的次数
		final int price = 5000;//常量，设置为final以后，price不能修改
		int guessPrice = -1;
		int count= 0;
		String giftName = null;
		for(int i = 0; i < 5; i++) {
			System.out.println("请输入神秘商品的单价: (" + ++count + "次)");
			guessPrice = new Scanner(System.in).nextInt();
			if(guessPrice == price) {
				if(count == 1) {
					System.out.println("牛逼了，一次就猜对了");
					System.out.println("奖品：iPhone11 Pro");
				}else if(count >= 2 && count <= 3) {
					System.out.println("奖品：三星S10");
				}else {
					System.out.println("奖品：HP 笔记本电脑");
				}
				break;
			}else {
				System.out.println("猜错了，继续！");
			}
		}
		
	}

}
