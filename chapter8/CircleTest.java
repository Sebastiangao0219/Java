/**
 * 
 */
package chapter8;

import java.util.Scanner;

/**
 * @author Sebastian Gao
 *
 */
public class CircleTest {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Circle circle = new Circle();
//		circle.inputRadius();
//		circle.showPerimeter();
//		circle.showArea();
		
		
		
//		Circle1 circle = new Circle1(23);
//		circle.showArea();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the radius: ");
		double radius = input.nextDouble();
		
		Circle3 circle = new Circle3(radius);
		circle.show();
	}
 
}
