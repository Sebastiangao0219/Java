package chapter4;

import java.util.Scanner;

/*
 * 使用循环实现三次密码输入错误退出系统
 */

public class PasswordDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password = null; 
		//1. 写出循环结构
		int i = 0;
		while (i < 3) {
			System.out.println("请输入密码: ");
			password = input.next();
			//Java中的字符串不允许这样判断: if(password == "123456")
			i++;
			//if(!password.equals("123456")) {//判断字符串相等的固定方式！！
			if(!"123456".equals(password)) {
				System.out.println("密码输入错误，请重新输入！（剩余）" + (3 - i) + "次）");
				if(i == 3) {
					System.out.println("密码输入错误已达三次，强制退出系统。");
					System.exit(0);
				}
			}else {//输入与密码相等
				//想办法退出这个循环结构
				//i = 4;//给i赋值一个大于等于3的数，退出循环
				//如何改进呢？将i值赋予一个整型的最大值
				i = Integer.MAX_VALUE;
			}
		}
		System.out.println("密码正确，成功登陆本系统！");
		//2. 考虑循环的次数
		//3. 输入并验证用户名和密码
	}

}
