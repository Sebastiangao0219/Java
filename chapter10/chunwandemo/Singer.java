/**
 * 
 */
package chapter10.chunwandemo;
/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺Jun 9, 2020 3:46:27 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
/**
 * @author g-sebastian
 * Singer
 */
public class Singer extends Actor {
	public Singer() {
		super();
	}
	
	public Singer(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println("Singer " + getName() + " is singing Poker Face.");
	}
}
