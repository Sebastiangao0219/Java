/**
 * 
 */
package chapter6;

/**
 * 冒泡排序 bubble sort
 * @author Sebastian Gao
 *
 */
public class BubbleSortDemo {

	public static void main(String[] args) {
		// 核心逻辑
		//1.一共会比较数组元素个数-1轮
		//2.每一轮比较的次数比上一轮少1
		//3.如果前面一个数字大于/小于后面一个数字，那么交换
		final int N = 50000;
		int[] nums = new int[N];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100000);
		}
		//int[] nums = {45, 32, 56, 90, 21};
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < nums.length - 1; i++) {//比较数组元素个数-1轮
			for (int j = 0; j < nums.length - i - 1; j++) {
				//i是轮数
				if(nums[j] < nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
				
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Bubble sort spent: " + (endTime - startTime) + " millisecond");
		//print res
//		System.out.println("After sort:");
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i] + "\t");
//			if((i + 1) % 15 == 0){
//				System.out.println();
//			}else {
//				System.out.print(", ");
//			}
//		}
		System.out.println();
	}

}
