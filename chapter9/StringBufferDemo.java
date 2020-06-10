package chapter9;
/** 
 * 加强版的字符串 - 带缓存的字符串 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：May 6, 2020 9:51:13 PM 
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
		
		//底层实现
		String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();

	}

}
