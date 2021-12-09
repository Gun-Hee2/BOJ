import java.util.Arrays;
import java.util.Scanner;

public class minmax {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		int[] selection = new int[count];
		
		
		for(int i = 0; i < count; i++) {
			selection[i] = scan.nextInt();
		}
		
		int scanmax = Arrays.stream(selection).max().getAsInt();
		int scanmin = Arrays.stream(selection).min().getAsInt();
		
		System.out.println(scanmin + " " + scanmax);
	}
}
