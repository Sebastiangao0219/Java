package chapter9;

import java.util.Scanner;

/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺May 6, 2020 3:15:03 PM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 * 
 * ʵ���û�ע�Ṧ��
 * 1���û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
 * 2������6-18λ��ֻ�ܰ�����ĸ�����֡��������(�»��ߡ�@��#��$��!)
 * �����֡�����ĸʱ������ǿ�ȶ����� (�������) ����+���롢����+���š�����+��ĸ��ǿ��Ϊ��(�������) ͬʱ���������ַ���ǿ��Ϊǿ(�������)
 * 3���û�������ȷ��email
 * �������@���ţ���ֻ�ܰ���һ�� @��. ���Ų����ڿ�ͷ��Ҳ�����ڽ�β
 * 
 */
public class UserMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		// ���´���ʵ���û�ע��
//		 System.out.println("Please input user name: ");
//		 String userName = input.next();
		 System.out.println("Please input password: ");
		 String password = input.next();
		 System.out.println(StringUtil.validatePassword(password));
//		 System.out.println("Please input your email: ");
//		 String email = input.next();

	}

}
