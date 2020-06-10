package chapter10;
/** 
 * 
 * 使用静态关键字实现了单例模式：只能获得某个类的唯一一个实例
 */
public class StaticDemo {
	/*
	 * 单例模式
	 */
	private static StaticDemo me = null;
	
	/*
	 * 将构造方法私有，以便实现外部无法使用new进行实例化的效果
	 */
	private StaticDemo() {
		//将构造方法定义为私有的
		me = this;
	}
	
	/*
	 * 要获得当前类对象的实例，只能调用本方法
	 */
	public static StaticDemo getInstance() {
		if(me == null) {
			me = new StaticDemo();//唯一的一次实例化 
		}
		return me;
	}
	
	/*
	 * 类属性
	 * 此变量可以用类名直接访问。e.g. StaticDemo.static_number
	 * 静态的属性和方法是先于类的实例存在的
	 */
	public static int static_number = 1;
	//成员变量，对象的属性
	public int normal_number = 1;
	
	/*
	 * 静态方法中只能调用静态属性和静态方法，
	 * 所以普通属性‘normal_number’在此方法中会报错
	 */
	public static void test1() {
		static_number++;
		//normal_number++;
	}
	
	public void test() {
		static_number++;
		normal_number++;
	}
}
	
//	public static void main(String[] args) {
//		StaticDemo staticDemo1 = new StaticDemo();
//		staticDemo1.test();
//		
//		System.out.println(StaticDemo.static_number);
//		System.out.println(staticDemo1.normal_number);
//		
//		StaticDemo staticDemo2 = new StaticDemo();
//		staticDemo2.test();
//		
//		System.out.println(StaticDemo.static_number);
//		System.out.println(staticDemo2.normal_number);
//	}
//}
