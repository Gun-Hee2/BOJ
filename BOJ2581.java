import java.util.Scanner;

public class BOJ2581 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		int a = 0;
		int count = 0;
		int sum = 0;
		
		int num[] = new int[(n-m)+1];
		
		for(int i = m; i <= n; i++) {
			for(int j = 2; j < i; j++) {
				
				if(i == 1) {
					continue;
				}else if(i % j == 0) {
					count++;
				}
			}
			
			if(count == 0 && i != 1) {
				num[a] = i;
				a++;
			}
			
			count = 0;
		}
		
		for(int i = 0; i < (n-m)+1; i++) {
			if(num[i] != 0) {
				sum += num[i];
			}else {
				break;
			}
		}
		
		if(num[0] == 0) {
			System.out.println("-1");
		}else {
			System.out.println(sum);
			System.out.println(num[0]);
		}
	}
}
