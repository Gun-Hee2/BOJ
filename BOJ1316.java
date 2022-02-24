import java.util.Arrays;
import java.util.Scanner;

public class BOJ1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int count = num;
		
		for(int i = 0; i < num; i++) {
			String word = scan.next();
			boolean check[] = new boolean[26];
			
			for(int j = 0; j < (word.length() - 1); j++){
				if(word.charAt(j) != word.charAt(j+1)) {
					if(check[word.charAt(j+1)-97] == true) {
						count--;
						break;
					}
				}
				check[word.charAt(j)-97] = true;
			}
		}
		
		System.out.println(count);
			
	}
}
