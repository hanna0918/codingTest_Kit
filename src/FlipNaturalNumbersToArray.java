
public class FlipNaturalNumbersToArray {
	//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴
	//n이 12345이면 [5,4,3,2,1]을 리턴
	
	class Solution {
	    public int[] solution(long n) {
	        int num = (int)(Math.log10(n)+1);
	        int[] answer = new int[num];
	        
	        for(int i=0; i<num; i++){
	            answer[i] = (int)(n%10);
	            n=n/10;
	        }
	        
	        return answer;
	    }
	}
}
