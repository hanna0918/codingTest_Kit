
public class Remainder_1 {
	//n�� x�� ���� �������� 1�� �ǵ��� �ϴ� ���� ���� �ڿ��� x�� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	//10�� 3���� ���� �������� 1�̰�, 3���� ���� �ڿ��� �߿��� ������ ������ �����ϴ� ���� �����Ƿ�, 3�� return �ؾ� �մϴ�.
	
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        for(int i=1; i<=n; i++){
	            if(n%i==1){
	                answer=i;
	                break;
	            }
	        }
	        return answer;
	    }
	}
}
