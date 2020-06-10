/**
 * 
 */
package chapter6;

import java.util.Scanner;

/**
 * @author Sebastian Gao
 *
 */
public class ArrayDeleteDemo {

	public static void main(String[] args) {
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
