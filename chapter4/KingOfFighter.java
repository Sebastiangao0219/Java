/**
 * 
 */
package chapter4;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;

/**
 * @author Sebastian Gao
 *
 */
@SuppressWarnings("deprecation")
public class KingOfFighter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//播放音乐代码
		File sound1 = new File("sounds/拳皇98选人画面.wav");
		AudioClip sound_choose;
		try {
			sound_choose = Applet.newAudioClip(sound1.toURL());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sound_choose.play();//播放音乐
		//随机数字：
		Math.random();//[0.0, 1.0) 左闭右开，生成0-1之间的小数，但是永远不可能到1
		
		//改成整型
		(int)(Math.random() * 10000) % 10
		
		
		
		
		
		
		
		
		
		//需要让程序暂停下，以播放音乐
		System.out.println("请输入任意键继续！");
		input.nextLine();
		
	}

}
