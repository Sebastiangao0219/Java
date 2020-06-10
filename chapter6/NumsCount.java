/**
 * 
 */
package chapter6;

import java.util.Random;

/**
 * @author Sebastian Gao
 * 定义一个整型数组，赋值后求出奇数个数和偶数个数
 */
public class NumsCount {

	public static void main(String[] args) {
		//随机生成一个数组
				int[] nums = new int[10];
				Random rand = new Random();
				for (int i = 0; i < nums.length; i++) {
					nums[i] = ((int)(Math.random() * 10000)) % 1001;////0-1000的随机数
					//nums[i] = rand.nextInt(1000 - 0 + 1) + 0;//0-1000的随机数
				}
				System.out.println("elements of array:");
				for (int i = 0; i < nums.length; i++) {
					System.out.print(nums[i] + ", ");
				}
				System.out.println();
				int count1 = 0, count2 = 0;//奇数和偶数的个数
				for (int i = 0; i < nums.length; i++) {
					if(nums[i] % 2 == 0) {
						count2++;
					}else {
						count1++;
					}
					
				}
				System.out.println("The number of odd number is: " + count1);
				System.out.println("The number of even numerb is: " + count2);
	}

}
