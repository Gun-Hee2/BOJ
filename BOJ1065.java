import java.util.Scanner;

public class BOJ1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int count = 0;
		
		if(num < 100) {
			count = num;
		}else {
			count = 99;
			for(int i = 100; i <= num; i++) {
				if((i/100)-((i/10)%10) == ((i/10)%10)-(i%10)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
