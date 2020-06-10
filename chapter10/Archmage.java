package chapter10;
/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：Jun 8, 2020 10:39:56 PM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class Archmage extends Hero {
	/*
	 * 战士类的静态属性，每实例化一个新的战士对象，
	 */
	public static int ID = 1;
	private int magicAttack;
	public Archmage() {
		setNickName("默认法师" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttack(99);
		ID++;
	}
	
	public Archmage(String nickName) {
		this();//调用本类的默认构造
		setNickName(nickName);
	}
	/*
	 *  
	 * 
	 */
	@Override  //Alt + /
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(getLevel()).append("\t");
		//str.append("\t");
		str.append(getNickName()).append("\t\t");
		//str.append("\t");
		str.append(getMaxLife()).append("\t");
		//str.append("\t");
		str.append(getCurrLife()).append("\t");
		//str.append("\t");
		str.append(getMagicAttack());
		
		return str.toString();
	}
	public void biubiubiu() {
		System.out.println("大法师" + getNickName() + "正在搓火球！");
	}

	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	
}
