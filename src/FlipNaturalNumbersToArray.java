
public class FlipNaturalNumbersToArray {
	//�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� ����
	//n�� 12345�̸� [5,4,3,2,1]�� ����
	
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
