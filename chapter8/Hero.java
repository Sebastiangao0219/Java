/**
 * 
 */
package chapter8;

/**
 * @author Sebastian Gao 游戏中对英雄类
 */
public class Hero {
	private long id;

	private String nickName;
	
	private long currExp;//当前的经验值

	private long exp;//当前级别升级所需经验值

	private int level;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	
	public Hero() {
		super();
	}


	public Hero(long id, String nickName, int level, long exp) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.level = level;
		this.exp = exp;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		if(id <= 0) id = 1;
		else
			this.id = id;
	}

	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		if(nickName == null) nickName = "unknown hero";
		else
			this.nickName = nickName;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}


	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		if(level < 1 || level > 999) 
			this.level = 1;//如果级别超限，就重新从1级开始
		else
			this.level = level;
	}


	/**
	 * @return the currExp
	 */
	public long getCurrExp() {
		return currExp;
	}


	/**
	 * @param currExp the currExp to set
	 */
	public void setCurrExp(long currExp) {
		this.currExp = currExp;
	}


	/**
	 * @return the exp
	 */
	public long getExp() {
		//玩家每级升级所需经验公式
		//((等级-1)^3 + 60) / 5 * ((等级-1) * 2 + 60)
		exp = (long) ((Math.pow(level - 1, 3) + 60) / 5 * ((level - 1) * 2 + 60 ));
		return exp;
	}

	/**
	 * @param exp the exp to set
	 */
	//因为玩家每个级别所需的经验值是固定公式计算的，所以不需要用户手动调用
//	public void setExp(long exp) {
//		this.exp = exp;
//	}
}
