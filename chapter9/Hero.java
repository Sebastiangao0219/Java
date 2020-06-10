package chapter9;

public class Hero {
	String name;//局部变量
	public void test1() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		new Hero().test1();
	}
}

