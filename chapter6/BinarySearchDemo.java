/**
 * 
 */
package chapter6;

import java.util.Scanner;

/**
 * 二分查找的前提 - 数组已经有序
 * @author Sebastian Gao
 *
 */
public class BinarySearchDemo {

	public static void main(String[] args) {
//		基本原理：
//		
//		首先将要查找的元素(key)与数组的中间元素比较
//
//		1、如果key小于中间元素，只需要在数组的前一半元素中继续查找
//
//		2、如果key和中间元素相等，匹配成功，查找结束
//
//		3、如果key大于中间元素，只需要在数组的后一半元素中继续查找
		Scanner input = new Scanner(System.in);
		int[] array = {2, 5, 8, 10, 15, 35, 45, 55, 65, 75, 95, 98};
		System.out.println("Please input the number you want: ");
		int searchNum = input.nextInt();
		boolean isFind = false;     //find it or not
		int low = 0;                //minIndex
		int high = array.length - 1;//maxIndex
		//we do not know to find how mant times
		while(high >= low) {
			//calculating midIndex
			int mid = (high + low) / 2;
			//if key less than array[mid],only need to find in the first half array
			if(searchNum < array[mid]){
				high = mid - 1;
			}else if(searchNum > array[mid]) {//if key greater than array[mid],only need to find in the last half array
				low = mid + 1;
			}else {//if key is equal to array[mid],then we found it,search ends.
				System.out.println("Congratulations! U Got it. Index is: " + mid);
				break;
			}
		}
		if(!isFind) {
		System.out.println("Sorry,there is no the number in this array!");
		}
	}
	
}
