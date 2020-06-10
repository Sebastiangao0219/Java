/**
 * 
 */
package chapter5;

/**
 * 演示break基本用法
 * @author Sebastian Gao
 *
 */
public class BreakDemo {

	public static void main(String[] args) {
		int count = 0;
		long startTime = System.currentTimeMillis();//1970-1-1到现在的毫秒数
		while(true) {//死循环
			if(count++ == Long.MAX_VALUE) {
			break;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("循环已结束" + count);
		System.out.println("循环用时：" + (endTime - startTime) + "毫秒！");
	}

}
