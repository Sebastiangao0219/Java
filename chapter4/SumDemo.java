package chapter4;
/*
 * 使用循环计算1-100的累加和
 * 需要循环变量
 * 需要累加和变量
 */
public class SumDemo {

	public static void main(String[] args) {
		//写出循环基本结构
		int sum = 0; //保存累加和
		//int i = 0;
		int i = 1;
		while(i <= 100) {
			//sum += (i + 1);//累加的核心代码
			//sum += i 是累加0-99的和
			//老司机也可以写成 int i = 1; sum += i++;
			//i++;
			sum += i++;
		}
		System.out.println("1-100的累加和为：" + sum);
	}

}
 