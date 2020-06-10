package chapter9;
/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺May 6, 2020 3:22:14 PM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 * 
 * 
 */
public class StringUtil {
      // ʵ���û�ע�Ṧ��
      // 1���û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
	 public static boolean isCorrectUserName(String userName) {
		 boolean isCorrect = true;
		 if(userName == null) return false;
		 if(userName.length() > 25) return false;
		 //�Ƿ��ַ�����
		 char[] unValidChar = {' ', '\'', '"', '?', '<', '>', ','};
		 for(char ch : unValidChar) {
			 if(userName.contains(Character.toString(ch))) {
				 isCorrect = false;
				 break;
			 }
		 }
		 return isCorrect;
	 }
	 /* 2������6-18λ��ֻ�ܰ�����ĸ�����֡��������(�»��ߡ�@��#��$��!)
	  * �����֡�����ĸʱ������ǿ�ȶ����� (�������) 
	  * ����+���롢����+���š�����+��ĸ��ǿ��Ϊ��(�������) 
	  * ͬʱ���������ַ���ǿ��Ϊǿ(�������)
	  * �������ֵΪ"",��ô�������֤ʧ��;�����֤�ɹ����򷵻��Һñ�ʾ����ǿ��
	  */
	 public static String validatePassword(String password) {
		 String power = "";//�����ǿ��
		 if(password == null) {
			 //System.err.println("Password cannot be null!");
			 return power;
		 }
		 if(password.length() < 6 || password.length() > 18) {
			 //System.err.println("Password length has to between 6 and 18!");
			 return power;
		 }
		 //�����кϷ�����ɲ���
		 String part = "_@#$!";
		 for(int i = 0; i < password.length(); i++) {
			 if(!Character.isLetterOrDigit(password.charAt(i))) {
				 //���������ĸ�����֣�����Ҳ���ǺϷ���������ţ���֤���ǷǷ��ĸ�ʽ
				 if(!part.contains(Character.toString(password.charAt(i)))) {
					 return power;
				 }
			 }
		 }
		//���濪ʼ�ж������ǿ��
		if(isDigit(password) || isLetter(password)){
			power = "�������";
		}else if(isDigitAndLetter(password)){
			power = "�������";
		}else if(isContainsSymble(password)){
			power = "�������";
		}
		//System.out.println(power); //power;
		return power;
	 } 
	 /*
	  * �ж�һ���ַ����ǲ���һ��������
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
	  * �ж�һ���ַ����ǲ���һ������ĸ
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
	  * �ַ����а����Ϸ�����ĸ������
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
//	  * �Ƿ�������֣���ĸ���������
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
//	 * 3���û�������ȷ��email
//	 * �������@���ţ���ֻ�ܰ���һ�� @��. ���Ų����ڿ�ͷ��Ҳ�����ڽ�β
	
}



























