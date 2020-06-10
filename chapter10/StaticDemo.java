package chapter10;
/** 
 * 
 * ʹ�þ�̬�ؼ���ʵ���˵���ģʽ��ֻ�ܻ��ĳ�����Ψһһ��ʵ��
 */
public class StaticDemo {
	/*
	 * ����ģʽ
	 */
	private static StaticDemo me = null;
	
	/*
	 * �����췽��˽�У��Ա�ʵ���ⲿ�޷�ʹ��new����ʵ������Ч��
	 */
	private StaticDemo() {
		//�����췽������Ϊ˽�е�
		me = this;
	}
	
	/*
	 * Ҫ��õ�ǰ������ʵ����ֻ�ܵ��ñ�����
	 */
	public static StaticDemo getInstance() {
		if(me == null) {
			me = new StaticDemo();//Ψһ��һ��ʵ���� 
		}
		return me;
	}
	
	/*
	 * ������
	 * �˱�������������ֱ�ӷ��ʡ�e.g. StaticDemo.static_number
	 * ��̬�����Ժͷ������������ʵ�����ڵ�
	 */
	public static int static_number = 1;
	//��Ա���������������
	public int normal_number = 1;
	
	/*
	 * ��̬������ֻ�ܵ��þ�̬���Ժ;�̬������
	 * ������ͨ���ԡ�normal_number���ڴ˷����лᱨ��
	 */
	public static void test1() {
		static_number++;
		//normal_number++;
	}
	
	public void test() {
		static_number++;
		normal_number++;
	}
}
	
//	public static void main(String[] args) {
//		StaticDemo staticDemo1 = new StaticDemo();
//		staticDemo1.test();
//		
//		System.out.println(StaticDemo.static_number);
//		System.out.println(staticDemo1.normal_number);
//		
//		StaticDemo staticDemo2 = new StaticDemo();
//		staticDemo2.test();
//		
//		System.out.println(StaticDemo.static_number);
//		System.out.println(staticDemo2.normal_number);
//	}
//}
