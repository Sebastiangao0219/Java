/**
 * 
 */
package chapter5;

/**
 * @author Sebastian Gao
 *
 */
public class ForDemo {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {//i只在内部有效，不影响下一个for循环的i
			System.out.println(i);
		}//此时，i被销毁，后面可以重新定义i

	}

}
