package chapter10.chunwandemo;
/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺Jun 9, 2020 3:50:06 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class Dancer extends Actor {
	public Dancer() {
		super();
	}
	
	public Dancer(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println("Dancer " + getName() + " is dancing.");
	}
}
