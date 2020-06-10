package chapter3;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
//		if (5 > 9) {
//			System.out.println("greater than");
//		}else {
//		System.out.println("less than");
//		}
		Scanner input = new Scanner(System.in);
		System.out.println("Please input disc sign: ");
		char ch = input.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("The sign is leagal!");
		}else{
			System.err.println("The sign is illeagal");
		}
	}

}
