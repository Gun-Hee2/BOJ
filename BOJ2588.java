import java.util.Scanner;

public class BOJ2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String b = scan.next();
		
		char c1 = b.charAt(0);
		char c2 = b.charAt(1);
		char c3 = b.charAt(2);
		
		System.out.println(a * (c3 - '0'));
		System.out.println(a * (c2 - '0'));
		System.out.println(a * (c1 - '0'));
		System.out.println(a * Integer.parseInt(b));
	}
}
