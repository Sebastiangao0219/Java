/**
 * 
 */
package chapter8.guessDemo;

import java.util.Scanner;

/**
 * @author Sebastian Gao
 * 游戏房间
 */
public class GameRoom {
	//属性：计分牌、道具、参与游戏的玩家、房间号、房间名称、房间密码
	//private String weapon;
	private HumanPlayer player1 = null;
	private ComPlayer player2 = null;
	/*
	 * 房间id
	 */
	private long roomId;
	/*
	 * 房间名称
	 */
	private String roomName;
	/*
	 * 房间密码
	 */
	private String roomPass;
	/**
	 * @return the roomId
	 */
	public GameRoom(String roomName, String roomPass) {
		if(!("Sebstian的游戏盒子".equals(roomName) && "123".equals(roomPass))) {
			System.out.println("房间密码错误，游戏强制退出！");
			return;
		}
		this.setRoomName(roomName);
		initGame();
		startGame();
		endGame();
	}
	
	//方法：开始游戏、初始化游戏、显示菜单、选择人物、判断输赢（可以定义在裁判类里）
	public void initGame() {
		//1 实例化游戏玩家对象
		player1 = new HumanPlayer();
		player2 = new ComPlayer();
		//2 初始化游戏的其他属性
		// 如游戏中的花花草草
		for(int i = 0; i < 30; i++) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n游戏加载成功！");
	}
	
	public void startGame() {
		showMenu();
		choiceRole();
		//双方出拳
		gaming();
		//打印结果
		
	}
	/*
	 * 游戏的大循环
	 */
	private void gaming() {
		while(true) {
			System.out.print(player1.getName() + "请出拳： ");
			//player1.setFist(new Scanner(System.in).nextInt());
			Scanner input = new Scanner(System.in);
			player1.setFist(input.nextInt());
			int fist1 = player1.getFist();
			player2.getFist();
			int fist2 = player2.getFist();
			
			
			//判断输赢
			int result = judge(fist1, fist2);//调用方法判断结果
			//如果返回-1，玩家1胜利；返回0，打平；返回1，玩家2胜利
			if(result == -1) {
				System.out.println("【松板老师】：" + player1.getName() + "胜利！");
				player1.sendMessage(HumanPlayer.MessageTypeWin);
				player2.sendMessage(ComPlayer.MessageTypeLose);
			}else if(result == 0) {
				System.out.println("【松板老师】：双方打平");
				player1.sendMessage(HumanPlayer.MessageTypeFist);
				player2.sendMessage(ComPlayer.MessageTypeFist);
			}else {
				System.out.println("【松板老师】：" + player2.getName() + "胜利！");
				player2.sendMessage(HumanPlayer.MessageTypeWin);
				player1 .sendMessage(ComPlayer.MessageTypeLose);
			}
			System.out.print("是否继续游戏(y/n)？");
			String answer = new Scanner(System.in).next();
			if(!"y".equalsIgnoreCase(answer)) {
				break;
			}
		}	
	}
	
	public void showMenu() {
		System.out.println("欢迎进入《" + roomName + "》游戏房间");
		System.out.println("出拳规则：1-剪刀；2-布；3-石头");
	}
	
	public void choiceRole() {
		System.out.println("对方角色：1-风间；2-旎旎；3-正南；4-阿呆。。");
		System.out.println("请选择：");
		int choice = new Scanner(System.in).nextInt();
		String[] nameArray = {"风间","旎旎","正南","阿呆"};
		//省略对用户输入的验证  自行完成
		 player2.setName(nameArray[choice -  1]);
		 player1.setName("野原新之助");
		 System.out.println(player1.getName() + " VS. " + player2.getName());
	}
	/*
	 * 如果返回-1，玩家1胜利；返回0，打平；返回1，玩家2胜利
	 */
	public int judge(int fist1, int fist2) {
		if(fist1 == fist2) return 0;//平局
		if(fist1 == 1 && fist2 ==3 || fist1 == 2 && fist2 == 1 || fist1 == 3 && fist2 == 2) {
			//玩家1的分数+1，玩家2的分数-1
			player1.setScore(player1.getScore() + 1);
			player2.setScore(player2.getScore() - 1);
		}
		//玩家2胜利
		player1.setScore(player1.getScore() - 1);
		player2.setScore(player2.getScore() + 1);
		return 1;
	}
	
	public void endGame() {
		System.out.println(player1.getName() + "\t" + player2.getName());
		System.out.println(player1.getScore() + "\t" + player2.getScore());
		System.out.println("游戏结束，欢迎再次回来！");
	}
	
	public long getRoomId() {
		return roomId;
	}
	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}
	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	/**
	 * @return the roomPass
	 */
	public String getRoomPass() {
		return roomPass;
	}
	/**
	 * @param roomPass the roomPass to set
	 */
	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}
}
