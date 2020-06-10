/**
 * 
 */
package chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Sebastian Gao
 * 查找输入的数字在数组中的下标，没有找到则下标为-1
 */
public class SearchDemo {

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
				//让用户输入要查找的数字
				//循环查找 遍历数组，查找对应的元素，如果找到了，打印下标，没找到，打印-1.
				System.out.println("Pls input the number you looking for:");
				int searchNum = new Scanner(System.in).nextInt();
				int searchIndex = -1;//专业用法：一般要找的下标，初值为-1（因为Index不可能位负）
				for (int i = 0; i < nums.length; i++) {
					if(searchNum == nums[i]) {
						//找到后，记录下要查找元素的下标
						searchIndex = i;
						break;//跳出
					}
				}
				
				//在循环后进行判断
				if(searchIndex == -1) {
					System.out.println("Sorry! There is no the number you want!");
				}else{
					System.out.println("The index of your expented number is: " + searchIndex);
					
				}
}

}
