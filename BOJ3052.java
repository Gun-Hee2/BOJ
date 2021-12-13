import java.util.Arrays;
import java.util.Scanner;

public class BOJ3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		int check = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt() % 42;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			check = 0;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					check++;
				}
			}
			if(check == 0) {
				count++;
			}
		}	
		System.out.println(count);
	}

}
