
public class BOJ4673 {

	public static void main(String[] args) {
		
		boolean check[] = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int n = self(i);
			if(n <= 10000) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(check[i] == false) {
				sb.append(i).append('\n');
			}
		}
		
		System.out.println(sb);
		
		

	}
	
	public static int self(int n) {
		int total = n;
		
		while(n != 0) {
			total += (n % 10);
			n /= 10;
		}
		
		return total;
	}

}
