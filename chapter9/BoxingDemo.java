package chapter9;
/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺2020��3��30�� ����12:14:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class BoxingDemo {

	public static void main(String[] args) {
		double num1 = 3.14;
		Double dNum1 = new Double("3.14");//װ��
		Double dNum1_1 = Double.valueOf(num1);//װ��
		Double dNum1_2 = num1;//�Զ�װ��
		Double dNum1_3 = 3.14;//�Զ�װ��
		
		
		num1 = dNum1;//�Զ����䣬�����ԭ��dNum1�����Ծ�û����
		num1 = dNum1_1.doubleValue();
		System.out.println(num1 + "\t" + dNum1.toHexString(num1));

	}

}
