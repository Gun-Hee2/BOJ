import java.util.Arrays;
import java.util.Scanner;

public class maxplace {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] selection = new int[9];
		
		for(int i = 0; i < 9; i++) {
			selection[i] = scan.nextInt(); 
		}	
		
		int max = Arrays.stream(selection).max().getAsInt();
		
		for(int i = 0; i < 9; i++) {
			if(selection[i] == max) {
				System.out.println(max + "\n" + (i + 1));
			}	
		}
	}
}
