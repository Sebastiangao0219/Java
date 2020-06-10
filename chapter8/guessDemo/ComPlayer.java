/**
 * 
 */
package chapter8.guessDemo;

/**
 * @author Sebastian Gao
 *
 */
public class ComPlayer {
	//静态常量：出拳的信息
	public static final int MessageTypeFist = 1;
	//静态常量：赢得比赛的信息
	public static final int MessageTypeWin = 2;
	//静态常量：输掉比赛的信息
	public static final int MessageTypeLose = 3;
	//属性：名称，分数，所出的拳，（角色对应的音效），角色的给你个话台词
	private String name;
	private int score;
	private int fist;
	/*
	 * 角色在出拳的时候所说的个性化台词
	 */
	private String[] fistWords = {
			"必杀：摇摇晃晃真拳！",
			"像我这么帅的人就可以在床上赚钱",
			"给你一记左勾拳！",
			"叫你一声你敢答应吗？",
			"大王叫我来巡山咯！"
	}; 
	
	private String[] winWords = {
			"我要打十个",
			"真相只有一个",
			"受死吧",
			"起开，下一个",
			"手下败将们！"
	};
	
	private String[] loseWords = {
			"放学你别走！",
			"再来一把！",
			"谁走谁孙子！",
			"输了表演拉粑粑！",
			"你咋不上天呢？"
	};
	//方法：设置和得到名称，分数，（播放音效），说个性化台词，出拳

	
	/*
	 * 根据传入的消息类型，随机打印对应类型的信息
	 * @param msgType 对应HumanPlayer类中定义的静态常量
	 * 
	 */
	public void sendMessage(int msgType) {
		//生成一个0-4之间的随机数
		int index = ((int)(Math.random() * 1000)) % 5;
		String message = null;//要打印的消息
		
		switch (msgType) {
		case MessageTypeFist:
			message = fistWords[index];
			break;
		case MessageTypeWin:
			message = winWords[index];
			break;
		case MessageTypeLose:
			message = loseWords[index];
			break;
		}
		System.out.println(message);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the fist
	 */
	public int getFist() {
		//电脑的出拳实际上就是生成了1-3之间的随机数字
		fist = ((int)(Math.random() * 30000)) % 3 + 1;//%3是0-2之间，再加1是1-3之间
		return fist;
	}

	
	
}
