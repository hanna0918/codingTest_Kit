
public class AddMissingNumber {
	//0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 
	//[1,2,3,4,6,7,8,0] => 5+9	return14
	//[5,8,4,0,6,7,9]	=> 1+2+3 return6
	
	class Solution {
	    public int solution(int[] n) {
	        int answer = 0+1+2+3+4+5+6+7+8+9;
	        
	        for(int i=0; i<n.length; i++){
	            answer -= n[i];
	        }
	        
	        return answer;
	    }
	}
}
