import java.util.Scanner;

public class BOJ1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int c = n;
		int count = 0;
		
		while(true){
			n = ((n%10)*10) + ((n/10)+(n%10))%10;
			count++;
			
			if(c == n) {
				break;
			}
		}		
		System.out.println(count);		
	}
}
