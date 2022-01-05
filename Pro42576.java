import java.util.Arrays;

public class Pro42576 {

	public static void main(String[] args) {
		String[] participant = {"mislav", "mislav", "mislav", "ana"};
		String[] completion = {"ana", "mislav", "mislav"};
		
		String word = solution(participant, completion);
		
		System.out.println(word);
    }
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        int[] num = new int[participant.length];
		int[] num2 = new int[completion.length];
		
		for(int i = 0; i < completion.length; i++){
            for(int j = 0; j < participant.length; j++){
                if(completion[i].contains(participant[j])){
                	num2[i]++;
                }
            }
	    }
		
        for(int i = 0; i < participant.length; i++){
            for(int j = 0; j < completion.length; j++){
                if(participant[i].contains(completion[j])){
                	num[i]++;
                	break;
                }else if(participant[i].contains(completion[j]) == false){
                	num[i] = 0;
                }
            }
	    }
        
        for(int i = 0; i < completion.length; i++) {
        	if(num2[i] != 1) {
        		for(int j = 0; j < participant.length; j++) {
        			if(participant[j] == completion[i]) {
        				num[j] = 0;
        			}
        		}
        	}
        }
        
        for(int k = 0; k < num.length; k++) {
        	if(num[k] == 0) {
        		answer = participant[k];
        	}
        }
        
        return answer;
    }
}
