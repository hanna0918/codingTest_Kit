
public class IntegerSquarRoot {
	//n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
	//121�� ���� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� ����
	//3�� ���� ������ ������ �ƴϹǷ�, -1�� ����
	
	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        long a = (long)Math.sqrt(n);
	        
	        if(n==(long)Math.pow(a,2)){
	            answer = (long)Math.pow(a+1,2);
	        }else{
	            answer= -1;
	        }
	        return answer;
	    }
	}
}
