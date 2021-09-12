package main;

import java.util.Scanner;

public class BOJ14681 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			System.out.println("1");
		}else if(num1 < 0 && num2 > 0) {
			System.out.println("2");
		}else if(num1 < 0 && num2 < 0) {
			System.out.println("3");
		}else if(num1 > 0 && num2 < 0) {
			System.out.println("4");
		}
	}
}
