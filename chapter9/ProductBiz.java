package chapter9;

import javax.swing.JOptionPane;

/** 
 * Product Management Class
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：Apr 4, 2020 1:52:52 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class ProductBiz {
	public static void main(String[] args) {
		/* 用来保存每种商品的总量 */
		int[] counts = new int[3];
		double total = 0; //最终要支付的总金额
		//改进方案：使用对象数组
		Product[] products = new Product[3];
		for (int i = 0; i < counts.length; i++) {
			 //Product product = new Product();
			 if(products[i] == null)
				 products[i] = new Product();//对象数组中的元素使用之前，一定要记得分配空间
			 String name = JOptionPane.showInputDialog("请输入商品名称: ");
			 //product.setName(name);
			 products[i].setName(name);
			 //接受用户输入的商品单价，要注意，返回是字符串类型！
			 String strPrice = JOptionPane.showInputDialog("请输入商品单价: ");
			 //需要将将字符串类型转换为double类型，再进行赋值！
			 //转换前最好进行正确性验证，避免异常
			 /*product.setPrice(Double.parseDouble(strPrice));*/ /*把strPrice转换成
			 double类型，再把这个double类型赋给了product属性*/
			 products[i].setPrice(Double.parseDouble(strPrice));
			 
			 String strCount = JOptionPane.showInputDialog("请输入购买的数量: ");
			 counts[i] = Integer.parseInt(strCount);
			 //累加总金额
			 total += products[i].getPrice() * counts[i];
		}
		System.out.println("购物结算: ");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() + "\t" + products[i].getPrice());
		}
		System.out.println("商品总金额为: " + total);
	}
}
