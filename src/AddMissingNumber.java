
public class AddMissingNumber {
	//0���� 9������ ���� �� �Ϻΰ� ����ִ� �迭 numbers�� �Ű������� �־����ϴ�. numbers���� ã�� �� ���� 0���� 9������ ���ڸ� ��� ã�� ���� ���� return 
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
