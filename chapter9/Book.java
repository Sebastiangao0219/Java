package chapter9;

import java.util.Scanner;

public class Book {
	private String name;
	private String isbn;
	private double price;
	private int count;// ��ǰͼ�����Ŀ����
	private boolean borrow;//�Ƿ�ɽ�
	 
	public Book() {};
	
	public Book(String name) {
		this.setName(name);
		
	}
	
	public Book(String name, String isbn, double price, int count) {
		setName(name);
		setIsbn(isbn);
		setPrice(price);
		setCount(count);
		setBorrow(borrow);
	}
	
	

	public boolean isBorrow() {
		return borrow;
	}

	public void setBorrow(boolean borrow) {
		this.borrow = borrow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0) {
			System.out.println("�۸�Ӧ����0�����������룺 ");
			price = new Scanner(System.in).nextDouble();
		}else {
			this.price = price;
		}
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if(count < 0) {
			count = 0;
		}else {
			this.count = count;
		}
	}

}
