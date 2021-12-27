import java.util.Scanner;

public class BOJ2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num1 = scan.next();
		String num2 = scan.next();
		String snum1 = "";
		String snum2 = "";
		
		for(int i = 2; i >= 0; i--) {
			snum1 += num1.charAt(i);
			snum2 += num2.charAt(i);
		}
		
		int fnum1 = Integer.parseInt(snum1);
		int fnum2 = Integer.parseInt(snum2);
		
		if(fnum1 > fnum2) {
			System.out.println(fnum1);
		}else if(fnum2 > fnum1) {
			System.out.println(fnum2);
		}
	}
}
