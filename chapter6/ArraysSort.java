/**
 * 
 */
package chapter6;

import java.util.Arrays;

/**
 * @author Sebastian Gao
 *
 */
public class ArraysSort {

	public static void main(String[] args) {
		final int N = 50000;
		int[] nums = new int[N];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100000);
		}
		
	long startTime = System.currentTimeMillis();
		Arrays.sort(nums);
	long endTime = System.currentTimeMillis();
	System.out.println("Select sort spent: " + (endTime - startTime) + " millisecond");
	//逆序：收尾交换
	for (int i = 0; i < nums.length / 2; i++) {//需要除2，否则过了中间位置又重新交换一遍，
		//整个排序无变化
		int temp = nums[i];
		nums[i] = nums[nums.length - i - 1];
		nums[nums.length - i - 1] = temp;
	}
	}
	

}
