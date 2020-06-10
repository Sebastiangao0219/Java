/**
 * 
 */
package chapter6;

/** 
 * 每次循环交换i的值和minIndex的值
 * @author Sebastian Gao
 *
 */
public class SelectSortDemo {

	public static void main(String[] args) {
		final int N = 50000;
		int[] nums = new int[N];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100000);
		}
		
	long startTime = System.currentTimeMillis();
		//选择排序：每次循环，交换i的值和minIndex的值
		for(int i = 0; i < nums.length; i++) {
			int min = nums[i];//假设第i个值是最小值
			int minIndex = i;//最小值的下标
			for (int j = i + 1; j < nums.length; j++) {
				if(min > nums[j]) {
					min = nums[j];
					minIndex = j;
				}
			}
		}
	long endTime = System.currentTimeMillis();
	System.out.println("Select sort spent: " + (endTime - startTime) + " millisecond");
	}

}
