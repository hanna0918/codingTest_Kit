
public class SumBetweenTwoIntegers {
	// �� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	// a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
	
	class Solution {
	    public long solution(int a, int b) {
	        long answer = 0;
	        
	        if(a<b){
	            for(long i=a; i<=b; i++){
	                answer += i;
	            }
	        }else if(a>b){
	            for(long i=b; i<=a; i++){
	                answer += i;
	            }
	        }else if(a==b){
	            answer = (long)a;
	        }
	        
	        return answer;
	    }
	}
}
