package chapter2;
/**
 * 
 * @author g-sebastian
 *
 */
public class VarDemo {
	
	public static void main(String[] args) {
		String brand = "华硕ASUS";//品牌
		String type = "GTX 1080";//类型
		int hz = 1569;
		float length = 29.8f;
 		double width = 13.4;
		double height = 5.25;
		
		//打印变量
//		System.out.println("品牌：" + brand);
//		System.out.println("型号：" + type);
//		System.out.println("核心频率："  + hz + "MHz");
//		System.out.println("长宽高：" + length + "\t" + width + "\t" + height);
		System.out.printf("%S\t%d\t%.2"
				+ "f\n",type,hz,width);
	}

}
