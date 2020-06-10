package chapter3;

import java.util.Scanner;

public class ShoppingCart1 {
	public static void main(String[] args) {
//		double priceLV = 35000.0;
//		double priceHermes = 11044.5;
//		double priceChanel = 1535.0;
//		double priceChanelTotal = 1535.0 * 5;
//		double priceTotal;
//		priceTotal = priceLV + priceHermes + priceChanelTotal;
//		if((priceLV > 5000 && priceHermes > 5000 && priceChanelTotal > 5000) || priceTotal > 35000) {
//			priceTotal = priceTotal * 0.3;
//		}else {
//			priceTotal = priceTotal * 0.8;
//		}
//		System.out.println(priceTotal);
		double priceLV,priceHermes,priceChanel;
		int count;
		double totalPrice;
		
		Scanner input = new Scanner(System.in);
		System.out.println("please input the price of LV:");
		priceLV = input.nextDouble();
		System.out.println("please input the number of LV:");
		count = input.nextInt();
		totalPrice = priceLV * count;
		System.out.println("please input the price of Hermes:");
		priceHermes = input.nextDouble();
		System.out.println("please input the number of Hermes:");
		count = input.nextInt();
		totalPrice += priceHermes * count;
		System.out.println("please input the price of Chanel:");
		priceChanel = input.nextDouble();
		System.out.println("please input the number of Chanel:");
		count = input.nextInt();
		totalPrice += priceChanel * count;
		if (priceLV > 5000 &&  priceHermes > 5000 && priceChanel > 5000 || totalPrice > 35000) {
			totalPrice *= 0.3;
		}else {
			totalPrice *= 0.8;
		}
		System.out.printf("Total price is: %.2f", totalPrice);
	}

}
