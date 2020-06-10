package chapter10;
/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺May 6, 2020 11:40:30 PM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class Hero {
	 private String nickName;
	 private int level;
	 private int maxLife;
	 private int currLife;
	 
	 
	public Hero() {
		super();
		//System.out.println("����Ĭ�Ϲ���");
		// TODO Auto-generated constructor stub
	}
	public Hero(String nickName, int level, int maxLife, int currLife) {
		super();
		this.nickName = nickName;
		this.level = level;
		this.maxLife = maxLife;
		this.currLife = currLife;
	}
	public int compareToByName(Hero hero) {
		return getNickName().compareTo(hero.getNickName());
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	public int compareTo(Hero hero) {
		//ֻ�Ƚϼ���
		if(this.level > hero.getLevel())
			return 1;
		else if(this.level == hero.getLevel())
			return 0;
		else
			return -1;
	}
	
	public void move() {
		System.out.println("Hero���move����");
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurrLife() {
		return currLife;
	}
	public void setCurrLife(int currLife) {
		this.currLife = currLife;
	}
	 
	 
}
