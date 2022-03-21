import java.util.Scanner;

public class BOJ1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0;
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			int num = scan.nextInt();
			
			if(num == 1) {
				continue;
			}
			
			for(int j = 2; j < num; j++) {
				if(num % j == 0) {
					count++;
				}
			}
			
			if(count == 0) {
				answer++;
			}
			
			count = 0;
		}

		System.out.println(answer);
	}
}
