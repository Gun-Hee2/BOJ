import java.util.Arrays;
import java.util.Scanner;

public class BOJ1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] grade = new int[count];
		double[] dgrade = new double[count];
		double[] cgrade = new double[count];
		int i;
		
		for(i = 0; i < count; i++) {
			grade[i] = scan.nextInt();
			dgrade[i] = grade[i];
		}
		
		Arrays.sort(grade);

		double sum = 0;
		
		for(i = 0; i < count; i++) {
			double max = grade[count - 1];
			cgrade[i] = (dgrade[i] / max * 100);
			sum += cgrade[i];
		}

	    double average = sum / count;
		
		System.out.println(average);
		
	}

}
