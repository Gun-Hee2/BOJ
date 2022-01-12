import java.util.Scanner;

public class BOJ2292 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 1;
		int min = 2;
		
		if(n == 1) {
			System.out.println(1);
		}else {
			while(min <= n) {
				min += (6 * count);
				count++;
			}
			System.out.println(count);
		}
	}
}
