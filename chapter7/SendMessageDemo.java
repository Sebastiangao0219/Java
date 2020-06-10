/**
 * 
 */
package chapter7;

/**
 * @author Sebastian Gao
 * 
 * 模拟实现游戏中的喊话功能
 * 可选参数：喊话者，频道，喊话内容， 喊话次数， 喊话的时间间隔等
 */
public class SendMessageDemo {

	public static void main(String[] args) {
		SendMessage("王二狗", "世界频道", "工会狩猎(40人团)，有空的++", 5, 1);

	}
	/*
	 * @param name        喊话的昵称
	 * @param channelNam  喊话的频道名称
	 * @param message	  喊话的内容
	 * @param count		  喊话的次数
	 * @param interval    喊话的时间间隔(单位：秒)
	 * @param
	 */
	
	public static void SendMessage(String name, String channelName, 
			String message, int count, int interval) {
		//if(interval < 5) interval = 5;
		//喊话的总体逻辑，拼接字符串以后打印出来
		String value = String.format("【%s】%s,%s", channelName, name, message);
		for(int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				Thread.sleep(interval * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//休眠多少秒
		}
	}

}
