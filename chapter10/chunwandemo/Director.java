package chapter10.chunwandemo;
/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：Jun 9, 2020 3:53:23 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 * 导演类，相当于项目中的核心业务类
 * 主要功能：让演员就位，开始表演
 */
public class Director {
	/*
	 * 导演的“action”方法，让演员就位开始表演节目
	 */
	
	public void action(Actor actor) {
		actor.performs();
	}
}
 