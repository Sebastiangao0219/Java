/**
 * 
 */
package chapter4;

import java.util.Scanner;

/**
 * 模拟我的武侠世界选择任务功能
 * @author Sebastian Gao
 *
 */
public class MyWuxiaWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "y";//用户输入的是否继续
		String name = null;
		do {
			System.out.println("欢迎进入我的武侠世界，请大侠起个响当当的名号闯荡江湖吧：");
			name = input.nextLine();
			System.out.println("头衔：【出入江湖】");
			System.out.println("江湖名号：" + name);
			System.out.println(name + "大侠，满意您的江湖名号吗？(y/n)");
			answer = input.nextLine();
			
		//}while(answer.equals("y"));//字符串比较时，不可以使用==
		//while(answer.eualsIgnoreCase("y")); //忽略大小写比较
		}while(!"y".equalsIgnoreCase(answer));//建议的写法
		System.out.printf("【%s】大侠重入江湖，宵小之辈速速退避! \n", name);
		input.close();//加上更好，也可以不加

	}

}
