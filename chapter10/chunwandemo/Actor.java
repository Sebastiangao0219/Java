package chapter10.chunwandemo;
/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：Jun 9, 2020 3:40:46 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 * 演员父类
 */

/*
 * 当一个类是抽象类的时候哦，就不能使用new来实例化来！
 * 抽象类是天生的父类
 */
public abstract class Actor {
	private String name;
	public Actor() {
		
	}
	
	public Actor(String name) {
		setName(name);
	}
	/*
	 * Perform method of an Actor
	 */
	public void performs() {
		System.out.println("Actor " + name + " is performing");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
