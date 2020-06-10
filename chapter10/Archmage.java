package chapter10;
/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺Jun 8, 2020 10:39:56 PM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class Archmage extends Hero {
	/*
	 * սʿ��ľ�̬���ԣ�ÿʵ����һ���µ�սʿ����
	 */
	public static int ID = 1;
	private int magicAttack;
	public Archmage() {
		setNickName("Ĭ�Ϸ�ʦ" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttack(99);
		ID++;
	}
	
	public Archmage(String nickName) {
		this();//���ñ����Ĭ�Ϲ���
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
		System.out.println("��ʦ" + getNickName() + "���ڴ����");
	}

	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	
}
