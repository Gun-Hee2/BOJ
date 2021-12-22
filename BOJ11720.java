import java.util.Scanner;

public class BOJ11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		String num = scan.next();
		
		for(int i = 0; i < n; i++) {
			String snum = num.substring(i, i+1);
			int inum = Integer.parseInt(snum);
			sum += inum;
		}
		
		System.out.println(sum);
		
	}
}
