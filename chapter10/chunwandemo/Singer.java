/**
 * 
 */
package chapter10.chunwandemo;
/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：Jun 9, 2020 3:46:27 AM 
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
