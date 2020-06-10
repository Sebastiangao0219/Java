package chapter9;

import java.util.Scanner;

/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：May 6, 2020 3:15:03 PM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 * 
 * 实现用户注册功能
 * 1、用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊符号
 * 2、密码6-18位，只能包含字母、数字、特殊符号(下划线、@、#、$、!)
 * 纯数字、纯字母时，密码强度都是弱 (★★☆☆☆☆) 数字+密码、数字+符号、数字+字母，强度为中(★★★★☆☆) 同时存在三种字符，强度为强(★★★★★★)
 * 3、用户输入正确的email
 * 必须包含@符号，且只能包含一个 @和. 符号不能在开头，也不能在结尾
 * 
 */
public class UserMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		// 以下代码实现用户注册
//		 System.out.println("Please input user name: ");
//		 String userName = input.next();
		 System.out.println("Please input password: ");
		 String password = input.next();
		 System.out.println(StringUtil.validatePassword(password));
//		 System.out.println("Please input your email: ");
//		 String email = input.next();

	}

}
