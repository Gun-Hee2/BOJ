import java.util.Scanner;

public class BOJ2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] apb = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String word = scan.next();
		
		for(int i = 0; i < apb.length; i++) {
			if(word.contains(apb[i]) == true) {
				word = word.replace(apb[i], ".");	
			}
		}
	
		System.out.println(word.length());
	}
}
