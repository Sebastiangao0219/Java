/**
 * 
 */
package chapter8;

/**
 * @author Sebastian Gao
 *
 */
public class Role {

	public String name;
	public int level;
	public String job;
	
	public Role() {}
	
	public Role(String name1, int level1, String job1) {
		name = name1;
		level = level1; 
		job = job1;
		
	}
	
	public void show() {
		System.out.println(name + "\t" + level + "\t" + job);
	}
	
	/*
	 * 释放技能
	 */
	public void doSkill() {
		if(name.equals("Laura")) {
		System.out.println(name +":" +" I an elegent old lady with two guns!");
		}else if(name.equals("WK")) {
			System.out.println(name + ":" +" 吃俺老孙一棒！");
		}else {
			System.out.println(name + ":" +" 发出了一个必杀！");
		}
	}	
	
}
