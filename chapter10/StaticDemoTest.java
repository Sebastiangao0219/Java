package chapter10;
/** 
 * 使用单例模式
 * 单例模式下，无论什么时候得到的对象都是同一个对象
 * 即例子中的staticDemo1，staticDemo2，staticDemo3 
 * 都是同一个对象
 */
public class StaticDemoTest {

	public static void main(String[] args) {
		StaticDemo staticDemo1 = StaticDemo.getInstance();
		System.out.println(staticDemo1.normal_number);
		
		StaticDemo staticDemo2 = StaticDemo.getInstance();
		staticDemo2.normal_number = 1024;
		
		StaticDemo staticDemo3 = StaticDemo.getInstance();
		System.out.println(staticDemo3.normal_number);
		
		System.out.println(staticDemo1 == staticDemo2);
	}

}
