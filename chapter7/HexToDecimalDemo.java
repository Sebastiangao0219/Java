/**
 * 
 */
package chapter7;

import java.util.Scanner;

/**
 * @author Sebastian Gao
 * 十六进制和十进制转换
 */
public class HexToDecimalDemo {

	public static void main(String[] args) {
		//1.让用户输入一个10进制数字
		Scanner input = new Scanner(System.in);
		System.out.println("Please input an integer number: ");
		int decNum = input.nextInt();
		//2.调用方法将10进制转换为16进制
		System.out.println(decToHex(decNum));
		//3.再将16进制转换回10进制
		System.out.println(hexToDec(decToHex(decNum)));

	}
	/*
	 * 16进制转换为10进制
	 * @param hex 要转换的16进制字符串
	 * @param 转换成功的10进制数字
	 */
	
	public static int hexToDec(String hex) {
		int decNum = 0;
		//需要遍历16进制字符串
		for (int i = 0; i < hex.length(); i++) {
			//取出字符串中的每一个字符进行判断
			char tempChar = hex.charAt(i);
			//两种情况:'0' - '9'    'A' - 'F'
			if(tempChar >= '0' && tempChar <= '9') {
				decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);
				
			}else if(tempChar >= 'A' && tempChar <= 'F') {
				decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);	
			}
		}
		return decNum;
	}
	
	/*调用方法将10进制转换为16进制
	 * @param decNum 要转换的10进制数字
	 * @return 转换成16进制的数字(以String类型返回)
	 */
	public static String decToHex(int decNum) {
		//基本逻辑是 decNum%16  反取余数
		String hex = "";//转换好的16进制String
		while(decNum != 0) {
			int tmp = decNum % 16;//取余数
			//余数有可能是0-9之间的数字或10-15之间的数字
			if( tmp >= 0 && tmp <= 9) {
				hex = tmp + hex;//每取一个余数，就往前拼接
			}else if(tmp >= 10 && tmp <= 15) {
				//把数字转换为字符再拼接
				hex = (char)(tmp - 10 + 'A' ) + hex;
			}
			decNum /= 16;
		}
		
		return hex;
	}

}
