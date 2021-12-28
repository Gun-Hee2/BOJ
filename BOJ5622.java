import java.util.Scanner;

public class BOJ5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		String fword = "";
		String[] apb = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		int num = 0;
		
		for(int i = 0; i < word.length(); i++) {
			for(int j = 0; j < 8; j++) {
				if(apb[j].contains(Character.toString(word.charAt(i)))) {
					fword += (j + 2);
				}
			}
		}
		
		for(int i = 0; i < word.length(); i++) {
			num += Integer.parseInt(Character.toString(fword.charAt(i)));
		}
		
		System.out.println(num + word.length());
	}
}
