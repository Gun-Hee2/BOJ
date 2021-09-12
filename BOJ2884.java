package main;

import java.util.Scanner;

public class BOJ2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hour;
		int minute;
		
		hour = scan.nextInt();
		minute = scan.nextInt();
		
		if(hour > 0 && (minute - 45) < 0) {
			System.out.println((hour - 1) + " " + (60 + (minute - 45)) );
		}else if(hour == 0 && (minute - 45) < 0) {
			System.out.println((24 - 1) + " " + (60 + (minute - 45)) );
		}else {
			System.out.println(hour + " " + (minute - 45));
		}
	}
}
