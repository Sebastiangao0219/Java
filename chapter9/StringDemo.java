package chapter9;

import java.util.Scanner;

/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：May 6, 2020 12:35:39 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class StringDemo {

	public static void main(String[] args) {
//		//演示常用的几种String对象的构建方式
//		String str1 = "Hello, World!";
//		String str2 = new String();
//		String str3 = new String(str1);
//		
//		char[] chArray = {'a', 'b', 'c'};//C中，字符数组和字符串的区别就再于最后一个元素是否是\0
//		//将字符数组转换成String对象
//		String str4 = new String(chArray);
//		System.out.println(str4);
//		//将字符串转换成字符数组
//		chArray = str4.toCharArray();
//		System.out.println(chArray);
//		
//		//字节数组与字符串的转换 byte数据转换：range -128到127之间
//		byte[] byteArray = {104, 101, 108, 108, 111};
//		String str5 = new String(byteArray);
//		System.out.println(str5);
//		
//		//字符串转码
//		String str6 = new String(str1.getBytes());
		
		
		
		
		
//		
//		//trim方法：去掉字符串左右两侧的空格
//		//建议：在用户输入用户名后使用
		Scanner input = new Scanner(System.in);
//		System.out.println("请输入用户名： ");
//		String uName = input.nextLine().trim();
//		System.out.println("--" + uName + "--");
		
//		
//		
//		String a = "abc";
//		String b = "234";
//		
//		String password = "ab3456abc";
//		System.out.println(password.indexOf("aaa"));
//		问题：判断字符串中只能有一个小数点，小数点不能在第一位，也不能在最后一位
//		money = 
		
		/*
		 * 判断传入的字符串是否是一个正确格式的小数
		 * 字符串中只能有一个小数点，小数点不能在第一位，也不能在最后一位
		 * 
		 */
	}
		public static boolean isDecimal(String str){
			boolean isDecimal = true;
			for (int i = 0; i < str.length(); i++) {
				if(!Character.isDigit(str.charAt(i))) {
					if(str.charAt(i) == '.') {
						if(i == 0 || i == str.length() - 1) {//如果小数点在第一位或最后一位，仍然是非法的，返回false
							isDecimal = false;
							break;
						}
					}else {//如果当前字符不是数字并且也不是小数点，那么证明是非法字符，直接返回false
						isDecimal = false;
						break;
					}
				}
			}
			
			// 判断字符串中只能有一个小数点
			//1.存在小数点 2.从前搜索的下标和从后往前搜索的下标刚好相等
			if(!(str.contains(".") && str.indexOf(".") == str.lastIndexOf("."))) {
				return false;
			}
			//1. 判断字符串中的每个元素必须是数字或小数点
			//2. 如果有小数点，那么小数点不能在第一位，也不能在最后一位，并且只能有一个小数点
			//if(str.indexOf('.') == 0 || str.indexOf(".") == str.length() - 1){
			return isDecimal;
				
		}
}
		


