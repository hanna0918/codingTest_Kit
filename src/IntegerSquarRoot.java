
public class IntegerSquarRoot {
	//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	//121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴
	//3은 양의 정수의 제곱이 아니므로, -1을 리턴
	
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
