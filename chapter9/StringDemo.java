package chapter9;

import java.util.Scanner;

/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺May 6, 2020 12:35:39 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class StringDemo {

	public static void main(String[] args) {
//		//��ʾ���õļ���String����Ĺ�����ʽ
//		String str1 = "Hello, World!";
//		String str2 = new String();
//		String str3 = new String(str1);
//		
//		char[] chArray = {'a', 'b', 'c'};//C�У��ַ�������ַ�����������������һ��Ԫ���Ƿ���\0
//		//���ַ�����ת����String����
//		String str4 = new String(chArray);
//		System.out.println(str4);
//		//���ַ���ת�����ַ�����
//		chArray = str4.toCharArray();
//		System.out.println(chArray);
//		
//		//�ֽ��������ַ�����ת�� byte����ת����range -128��127֮��
//		byte[] byteArray = {104, 101, 108, 108, 111};
//		String str5 = new String(byteArray);
//		System.out.println(str5);
//		
//		//�ַ���ת��
//		String str6 = new String(str1.getBytes());
		
		
		
		
		
//		
//		//trim������ȥ���ַ�����������Ŀո�
//		//���飺���û������û�����ʹ��
		Scanner input = new Scanner(System.in);
//		System.out.println("�������û����� ");
//		String uName = input.nextLine().trim();
//		System.out.println("--" + uName + "--");
		
//		
//		
//		String a = "abc";
//		String b = "234";
//		
//		String password = "ab3456abc";
//		System.out.println(password.indexOf("aaa"));
//		���⣺�ж��ַ�����ֻ����һ��С���㣬С���㲻���ڵ�һλ��Ҳ���������һλ
//		money = 
		
		/*
		 * �жϴ�����ַ����Ƿ���һ����ȷ��ʽ��С��
		 * �ַ�����ֻ����һ��С���㣬С���㲻���ڵ�һλ��Ҳ���������һλ
		 * 
		 */
	}
		public static boolean isDecimal(String str){
			boolean isDecimal = true;
			for (int i = 0; i < str.length(); i++) {
				if(!Character.isDigit(str.charAt(i))) {
					if(str.charAt(i) == '.') {
						if(i == 0 || i == str.length() - 1) {//���С�����ڵ�һλ�����һλ����Ȼ�ǷǷ��ģ�����false
							isDecimal = false;
							break;
						}
					}else {//�����ǰ�ַ��������ֲ���Ҳ����С���㣬��ô֤���ǷǷ��ַ���ֱ�ӷ���false
						isDecimal = false;
						break;
					}
				}
			}
			
			// �ж��ַ�����ֻ����һ��С����
			//1.����С���� 2.��ǰ�������±�ʹӺ���ǰ�������±�պ����
			if(!(str.contains(".") && str.indexOf(".") == str.lastIndexOf("."))) {
				return false;
			}
			//1. �ж��ַ����е�ÿ��Ԫ�ر��������ֻ�С����
			//2. �����С���㣬��ôС���㲻���ڵ�һλ��Ҳ���������һλ������ֻ����һ��С����
			//if(str.indexOf('.') == 0 || str.indexOf(".") == str.length() - 1){
			return isDecimal;
				
		}
}
		


