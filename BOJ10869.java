import java.util.Scanner;

public class BOJ10869 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println((a+b) + "\n" + (a-b) + "\n" + (a*b) + "\n" + (a/b) + "\n" + (a%b));
	}
}
