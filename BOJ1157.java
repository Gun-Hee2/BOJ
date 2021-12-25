import java.util.Scanner;

public class BOJ1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		String lword = word.toLowerCase();
		int[] num = new int[26];
		
		for(int i = 0; i < word.length(); i++) {
			num[lword.charAt(i) - 'a']++;
		}
		
		int max = -1;
		char ch = ' ';
		
		for(int i = 0; i < 26; i++) {
			if(num[i] > max) {
				max = num[i];
				ch = (char)(i + 97);
			}
			else if(max == num[i]) {
				ch = '?';
			}
		}
		
		String uch = (String.valueOf(ch)).toUpperCase();
		
		System.out.println(uch);
	}
}
