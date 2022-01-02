import java.util.Arrays;
import java.util.Scanner;

public class BOJ1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String[] word = new String[num];
		String nword = "";
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			word[i] = scan.next();
		}
		
		for(int i = 0; i < word[i].length(); i++) {
			for(int j = i + 1; j < word[i].length(); j++) {
				if(word[i] == word[j]) {
					count++;
				}else if(word[i] != word[j]) {
					i++;
				} 
			}
		}
		
		System.out.println(count);
	}
}
