package main;

import java.util.Scanner;

public class BOJ1330 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A;
		int B;
		
		A = scan.nextInt();
		B = scan.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else if(A == B) {
			System.out.println("==");
		}

	}

}
