package chapter9;
/** 
 * ��ǿ����ַ��� - ��������ַ��� 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺May 6, 2020 9:51:13 PM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "b";
		String str3 = str1 + str2;
		
		//�ײ�ʵ��
		String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();

	}

}
