
public class SumOfFactors {
	//���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	//12�� ����� 1, 2, 3, 4, 6, 12�Դϴ�. �̸� ��� ���ϸ� 28�Դϴ�.
	
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        for(int i=1; i<=n; i++){
	            if (n%i==0){
	                answer+=i;
	            }else{
	                answer+=0;
	            }
	        }
	        return answer;
	    }
	}
}
