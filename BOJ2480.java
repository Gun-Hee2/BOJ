import java.util.Scanner;

public class BOJ2480 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = 0;
		
		if(a == b) {
			if(a == c) {
				System.out.println(10000 + (a*1000));
			}else {
				System.out.println(1000 + (a*100));
			}
		}else {
			if(b == c || a == c) {
				System.out.println(1000 + (c*100));	
			}else{
				if(a > b) {
					if(a > c) {
						max = a;
					}else {
						max = c;
					}
				}else {
					if(b > c) {
						max = b;
					}else {
						max = c;
					}
				}
				System.out.println(max*100);
			}
		}
	}
}
