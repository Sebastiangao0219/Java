package chapter9;

import javax.swing.JOptionPane;

/** 
 * Product Management Class
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺Apr 4, 2020 1:52:52 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class ProductBiz {
	public static void main(String[] args) {
		/* ��������ÿ����Ʒ������ */
		int[] counts = new int[3];
		double total = 0; //����Ҫ֧�����ܽ��
		//�Ľ�������ʹ�ö�������
		Product[] products = new Product[3];
		for (int i = 0; i < counts.length; i++) {
			 //Product product = new Product();
			 if(products[i] == null)
				 products[i] = new Product();//���������е�Ԫ��ʹ��֮ǰ��һ��Ҫ�ǵ÷���ռ�
			 String name = JOptionPane.showInputDialog("��������Ʒ����: ");
			 //product.setName(name);
			 products[i].setName(name);
			 //�����û��������Ʒ���ۣ�Ҫע�⣬�������ַ������ͣ�
			 String strPrice = JOptionPane.showInputDialog("��������Ʒ����: ");
			 //��Ҫ�����ַ�������ת��Ϊdouble���ͣ��ٽ��и�ֵ��
			 //ת��ǰ��ý�����ȷ����֤�������쳣
			 /*product.setPrice(Double.parseDouble(strPrice));*/ /*��strPriceת����
			 double���ͣ��ٰ����double���͸�����product����*/
			 products[i].setPrice(Double.parseDouble(strPrice));
			 
			 String strCount = JOptionPane.showInputDialog("�����빺�������: ");
			 counts[i] = Integer.parseInt(strCount);
			 //�ۼ��ܽ��
			 total += products[i].getPrice() * counts[i];
		}
		System.out.println("�������: ");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() + "\t" + products[i].getPrice());
		}
		System.out.println("��Ʒ�ܽ��Ϊ: " + total);
	}
}
