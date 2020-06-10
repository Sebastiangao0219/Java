/**
 * 
 */
package chapter6;

/**
 * @author Sebastian Gao
 *
 */
public class ArrayDemo {

	public static void main(String[] args) {
//		int[] nums = null;//声明了一个整型数组 nums
//		nums[0] = 9;
		//异常 - 空指针异常 - 没有空间
		
		//数组名就是新分配内存空间的首地址
		int[] nums = new int[5]; //在对内存中分配了5个int类型大小的空间
		System.out.println(nums);
		
		int num;  //处理基本类型时：在栈内存中直接分配了空间（不需要手动分配空间）
		num = 9;
//		Scanner input = new Scanner(System.in); // new: 在堆内存中分配了空间
//		input.next();
	}

}
