/**
 * 
 */
package chapter8;

import java.util.Scanner;

/**
 * @author Sebastian Gao
 *
 */
public class Circle1 {
	/*
	 * radius
	 */
	public double radius;
	/*
	 * perimeter
	 */
	public double perimeter;
	/*
	 * area
	 */
	public double area;
	
	public Circle1() {
		inputRadius();
	}
	
	public Circle1(double radius1) {
		if(radius1 > 0) {
			radius = radius1;
		}else{
			inputRadius();
		}
	}
	
	public void inputRadius() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the radius: ");
		radius = input.nextDouble();
		input.close();
		
	}
	
	public void showPerimeter() {
		if(radius == 0) {
			inputRadius();//如果用户没有输入半径，那么强制用户输入半径
		}
		perimeter = 2 * Math.PI * radius;
		System.out.printf("The perimeter of the ciecle is%9.3f ",perimeter);
	}
	
	public void showArea() {
		if(radius == 0) {
			inputRadius();//如果用户没有输入半径，那么强制用户输入半径
		}
		area = Math.PI * Math.pow(radius, 2);
		System.out.printf("Area of the circle is%.2f",area);
	}
}
