import java.util.Scanner;

public class BOJ1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String sentence = scan.nextLine();
		int count = 0;
		
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				count++;
			}
		}
		
		if(sentence.charAt(0) != ' ' && sentence.charAt(sentence.length() - 1) != ' ') {
			System.out.println(count + 1);
		}
		else if(sentence.charAt(0) == ' ' && sentence.charAt(sentence.length() - 1) != ' ') {
			System.out.println(count);
		}
		else if(sentence.charAt(0) != ' ' && sentence.charAt(sentence.length() - 1) == ' ') {
			System.out.println(count);
		}
		else if(sentence.charAt(0) == ' ' && sentence.charAt(sentence.length() - 1) == ' ') {
			System.out.println(count - 1);
		}
	}
}
