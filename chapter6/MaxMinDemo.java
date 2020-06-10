/**
 * 
 */
package chapter6;

import java.util.Random;

/**
 * @author Sebastian Gao
 * 求数组中的最大值和最小值
 */
public class MaxMinDemo {

	public static void main(String[] args) {
		//随机生成一个数组，求里面的最大值和最小值
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
		//求最大值和最小值
		//1.假设第一个元素是最大值/最小值
		//2.拿最大值/最小值在数组中逐个比较，如果某个元素笔最大值还大，选它。
		//int max = nums[0];
		//int min = nums[0];
		int max = Integer.MIN_VALUE;//更专业的写法
		int min = Integer.MAX_VALUE;
		//for (int i = 1; i < nums.length; i++) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {//如果数组中的某个元素比max还大
				max = nums[i];
			}
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("The biggest number in the array is : " + max);
		System.out.println("The smallest number in the array is : " + min);
	}

}
