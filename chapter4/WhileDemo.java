package chapter4;

public class WhileDemo {

	public static void main(String[] args) {
		//循环变量尽量只用来控制循环的次数
		int i = 0;//循环变量的初值
		while (i < 10) {//循环变量的判断
			System.out.println(i + 1);
			i++;   //循环变量的更新
		}

	}

}
