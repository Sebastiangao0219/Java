/**
 * 
 */
package chapter8;

/**
 * @author Sebastian Gao
 *
 */
public class RoleTest {

	public static void main(String[] args) {
		//实例化
		Role role1 = new Role();
		role1.name = "Laura";
		role1.job = "Old lady";
		role1.level = 25;
		role1.doSkill();
		role1.show();
		
		Role role2 = null;//声明了Role类型的变量 role2
		role2 = new Role();
		role2.name = "WK";
		role2.job = "God";
		role2.level = 99;
		role2.doSkill();
		role2.show();
		
		Role role3 = new Role();
		role3.name = "Betty";
		role3.level = 25;
		role3.doSkill();
		role3.show();
		
	}

}
