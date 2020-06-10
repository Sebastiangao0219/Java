/**
 * 
 */
package chapter6;

/**
 * @author Sebastian Gao
 *
 */
public class ForEachDemo {

	public static void main(String[] args) {
		String[] values = {"abs","def","cvs"};
		for (String value : values) {
			System.out.println(value);
		}
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

}
