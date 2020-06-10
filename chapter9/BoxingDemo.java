package chapter9;
/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：2020年3月30日 上午12:14:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class BoxingDemo {

	public static void main(String[] args) {
		double num1 = 3.14;
		Double dNum1 = new Double("3.14");//装箱
		Double dNum1_1 = Double.valueOf(num1);//装箱
		Double dNum1_2 = num1;//自动装箱
		Double dNum1_3 = 3.14;//自动装箱
		
		
		num1 = dNum1;//自动拆箱，拆箱后，原来dNum1的属性就没有了
		num1 = dNum1_1.doubleValue();
		System.out.println(num1 + "\t" + dNum1.toHexString(num1));

	}

}
