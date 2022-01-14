import java.util.Scanner;

public class BOJ10250 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();		
		int f = 1;
		int r = 1;
		int num = 0;
		
		for(int i = 0; i < t; i++) {
			while(true){
				f = 1;
				r = 1;
				num = 0;
				int h = scan.nextInt();
				int w = scan.nextInt();
				int n = scan.nextInt();
				for(int j = 0; j < n; j++) {
					num = (100 * f) + r;
					f++;
					if(num > (100 * h)) {
						r++;
						f = 1;
					}
				}
				System.out.println(num);
				break;
			}
		}
	}
}
