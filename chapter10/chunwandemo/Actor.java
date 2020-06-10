package chapter10.chunwandemo;
/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺Jun 9, 2020 3:40:46 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 * ��Ա����
 */

/*
 * ��һ�����ǳ������ʱ��Ŷ���Ͳ���ʹ��new��ʵ��������
 * �������������ĸ���
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
