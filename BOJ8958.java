import java.util.Scanner;

public class BOJ8958 {
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in); 
      
      int N = sc.nextInt();
      int[] arr = new int[N];
      int sum = 0;
      for(int i = 0; i<N; i++) {
         int count =0;
         String str = sc.next();
         for(int j = 0; j<str.length(); j++) {
            char c = str.charAt(j);
            if(c == 'O') {
               count++;
               sum +=count;
            }else {
               count =0;
            }
         }
         arr[i] = sum;
         sum = 0;
      }
      for(int i = 0; i < N; i++) {
    	  System.out.println(arr[i]);
      }
   }
}