/**
 * 
 */
package chapter7;

/**
 * @author Sebastian Gao
 *
 */
public class ParamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//paramTest("Parameter Test", 1, 2, 3, 4, 5);
		paramTest("Parameter Test");
	}
	public static void paramTest(String str, int... nums) {
		System.out.println("The first parameter: " + str);
		
		System.out.println("The length of the array: " + nums.length);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
