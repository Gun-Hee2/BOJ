import java.util.Scanner;

public class BOJ2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		int fmin = scan.nextInt();
		
		if((min + fmin) / 60 > 0) {
			hour += ((min+fmin)/60);
			min = (min+fmin)%60;
			if(hour >= 24) {
				hour -= 24;
			}
			System.out.println(hour + " " + min);
		}else {
			min += fmin;
			System.out.println(hour + " " + min);
		}
	}
}
