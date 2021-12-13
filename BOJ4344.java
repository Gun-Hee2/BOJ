import java.util.Arrays;
import java.util.Scanner;

public class BOJ4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();		
		int[] tcase = new int[C];
		int sum = 0;
		int average = 0;
		double count = 0;
		double rate = 0;
		for(int i = 0; i < C; i ++) {
			int N = scan.nextInt();
			tcase = new int[N];
			for(int j = 0; j < N; j ++) {
				int val = scan.nextInt();
				tcase[j] = val;
				sum += tcase[j];
				average = sum / N;
			}
			sum = 0;
			for(int k = 0; k < N; k ++) {
				if(tcase[k] > average) {
					count++;
				}
			}
			rate = ((count / N) * 100);
			String srate = Double.toString(rate);
			String srate2 = srate.format("%.3f", rate);
			System.out.println(srate2 + "%");		
			count = 0;
		}
	}
}
