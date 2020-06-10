/**
 * 
 */
package chapter8;

/**
 * @author Sebastian Gao
 *
 */
public class Circle3 {
	/*
	 * radius
	 */
	private double radius;
	/*
	 * perimeter
	 */
	private double perimeter;
	/*
	 * area
	 */
	private double area;
	
	public Circle3() {}
	
	public Circle3(double radius) {
		// TODO Auto-generated constructor stub
		this.setRadius(radius);
	}


	public double getRadius() {
		return radius;
	}
	
	
	public void setRadius(double radius) {
		if(radius <= 0) {//封装的好处： 可以对传入对属性进行简单对验证
			radius = 1;
		}else {
		//this -> 自指针  我的半径等于外面传进来的半径
		this.radius = radius;
		}
	}
	
	public void show() {
		System.out.printf("Perimeter is:%.2f\n", this.getPerimeter());
		System.out.println("Area is: " + this.getArea());
	}


	/**
	 * @return the perimeter
	 */
	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}




	/**
	 * @return the area
	 */
	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}


	
	

}
