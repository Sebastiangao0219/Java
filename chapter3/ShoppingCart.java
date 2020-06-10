package chapter3;

import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) {
//		double priceLV = 35000.0;
//		double priceHermes = 11044.5;
//		double priceChanel = 1535.0;
//		double priceTotal;
//		priceTotal = priceLV + priceHermes + priceChanel*5.0;
//		if (priceTotal > 50000.0) {
//			priceTotal = priceTotal * 0.7;
//		}else {
//			priceTotal = priceTotal * 0.9;
//		}
//		System.out.printf("PriceTotal: %.2d", priceTotal);
		double price;
		int count;
		double totalPrice;
		Scanner input = new Scanner(System.in);
		System.out.println("please input the price of LV:");
		price = input.nextDouble();
		System.out.println("please input the number of LV:");
		count = input.nextInt();
		totalPrice = price * count;
		System.out.println("please input the price of Hermes:");
		price = input.nextDouble();
		System.out.println("please input the number of Hermes:");
		count = input.nextInt();
		totalPrice += price * count;
		System.out.println("please input the price of Chanel:");
		price = input.nextDouble();
		System.out.println("please input the number of Chanel:");
		count = input.nextInt();
		totalPrice += price * count;
	if(totalPrice > 50000 ) {
		totalPrice *= 0.7;
	}else {
		totalPrice *= 0.9;
	}
	System.out.printf("The total price is: %.2f",totalPrice);
	}
}
