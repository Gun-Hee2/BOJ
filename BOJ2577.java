import java.util.Arrays;
import java.util.Scanner;

public class BOJ2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int imulnum = num1 * num2 * num3;
		
		String smulnum = Integer.toString(imulnum);
		
		String[] strarr = new String[smulnum.length()];
		
		strarr = smulnum.split("");
		
		int i;
		
		int numcount = 0;
		
		int[] intarr = new int[smulnum.length()];
		
		for(i = 0; i < smulnum.length(); i++) {
			int selnum = Integer.parseInt(strarr[i]);
			intarr[i] = selnum;
		}
		
		int[] num = new int[smulnum.length()];
		
		int[] count = new int[10];
		
		for(i = 0; i < 10; i++) {
			for(int j = 0; j < smulnum.length(); j++) {
				if(i == intarr[j]) {
					count[i]++;
				}
			}
		}
	    
		for(i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}

	}

}
