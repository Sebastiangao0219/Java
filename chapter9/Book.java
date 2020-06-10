package chapter9;

import java.util.Scanner;

public class Book {
	private String name;
	private String isbn;
	private double price;
	private int count;// 当前图书对象的库存量
	private boolean borrow;//是否可借
	 
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
			System.out.println("价格应大于0，请重新输入： ");
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
