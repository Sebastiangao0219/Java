/**
 * 
 */
package chapter4;

/**
 * @author Sebastian Gao
 *
 */
public class CalMoney1 {

	public static void main(String[] args) {
		double item = 1;
		double sum = 0;
		int i = 0;
		while(item != 0) {//死循环
			sum += item;
			item -= 0.1;
			System.out.println(item);
			i++;
		}
		System.out.println(sum);
	}

}
