import java.util.Scanner;

public class BOJ10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(word.indexOf(c) + " ");
		}
	}
}
