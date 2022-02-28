import java.util.Scanner;

public class BOJ1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int cross_count = 1;
		int prev_sum = 0;
		
		while(true) {
			if(num > cross_count + prev_sum) {
				prev_sum += cross_count;
				cross_count++;
			}else {
				if(cross_count % 2 == 1) {
					System.out.println((cross_count-(num-prev_sum-1)) + "/" + (num-prev_sum));
					break;
				}
				
				else {
					System.out.println((num-prev_sum) + "/" + (cross_count-(num-prev_sum-1)));
					break;
				}
			}
		}
	}
}
