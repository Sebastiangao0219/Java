package chapter9;
/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：May 6, 2020 3:22:14 PM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 * 
 * 
 */
public class StringUtil {
      // 实现用户注册功能
      // 1、用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊符号
	 public static boolean isCorrectUserName(String userName) {
		 boolean isCorrect = true;
		 if(userName == null) return false;
		 if(userName.length() > 25) return false;
		 //非法字符数组
		 char[] unValidChar = {' ', '\'', '"', '?', '<', '>', ','};
		 for(char ch : unValidChar) {
			 if(userName.contains(Character.toString(ch))) {
				 isCorrect = false;
				 break;
			 }
		 }
		 return isCorrect;
	 }
	 /* 2、密码6-18位，只能包含字母、数字、特殊符号(下划线、@、#、$、!)
	  * 纯数字、纯字母时，密码强度都是弱 (★★☆☆☆☆) 
	  * 数字+密码、数字+符号、数字+字母，强度为中(★★★★☆☆) 
	  * 同时存在三种字符，强度为强(★★★★★★)
	  * 如果返回值为"",那么密码的验证失败;如果验证成功，则返回幸好表示密码强度
	  */
	 public static String validatePassword(String password) {
		 String power = "";//密码的强度
		 if(password == null) {
			 //System.err.println("Password cannot be null!");
			 return power;
		 }
		 if(password.length() < 6 || password.length() > 18) {
			 //System.err.println("Password length has to between 6 and 18!");
			 return power;
		 }
		 //密码中合法的组成部分
		 String part = "_@#$!";
		 for(int i = 0; i < password.length(); i++) {
			 if(!Character.isLetterOrDigit(password.charAt(i))) {
				 //如果不是字母或数字，并且也不是合法的特殊符号，就证明是非法的格式
				 if(!part.contains(Character.toString(password.charAt(i)))) {
					 return power;
				 }
			 }
		 }
		//下面开始判断密码的强度
		if(isDigit(password) || isLetter(password)){
			power = "★★☆☆☆☆";
		}else if(isDigitAndLetter(password)){
			power = "★★★★☆☆";
		}else if(isContainsSymble(password)){
			power = "★★★★★★";
		}
		//System.out.println(power); //power;
		return power;
	 } 
	 /*
	  * 判断一个字符串是不是一个纯数字
	  */
	 private static boolean isDigit(String value) {
		 for(int i = 0; i < value.length(); i++) {
			 if(!Character.isDigit(value.charAt(i))) {
				 return false;
			 }
		 }
		 return  true;
	 }
	 
	 /*
	  * 判断一个字符串是不是一个纯字母
	  */
	 
	 private static boolean isLetter(String value) {
		 for(int i = 0; i < value.length(); i++) {
			 if(!Character.isLetter(value.charAt(i))) {
				 return false;
			 }
		 }
		 return  true;
	 }
	 
	 /*
	  * 字符串中包含合法的字母和数字
	  */
	 
	 private static boolean isDigitAndLetter(String value) {
		 for (int i = 0; i < value.length(); i++) {
			if(!Character.isLetterOrDigit(value.charAt(i))) {
				return false;
			}
		}
		return true; 
	 }
	 
	 private static boolean isContainsSymble(String value) {
		 String part = "_@#$!";
			for (int i = 0; i < value.length(); i++) {
				if(part.contains(Character.toString(value.charAt(i)))){
					return true;
				}
			}
			return false;
	 }
	 
//	 /*
//	  * 是否包含数字，字母和特殊符号
//	  */
//	 private static boolean isDigitAndLetterAndSymble(String value) {
//		 for(int i = 0; i < value.length(); i++) {
//			 if(!(Character.isDigit(value.charAt(i)) || 
//					 Character.isLetter(value.charAt(i)) || 
//					 "_@#$!".contains(Character.toString(value.charAt(i))))){
//				 return false;
//			 }
//		 }
//		 return true;
//	 }
	 
//	 private static boolean isContainSymble()
//	 * 3、用户输入正确的email
//	 * 必须包含@符号，且只能包含一个 @和. 符号不能在开头，也不能在结尾
	
}



























