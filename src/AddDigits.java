
public class AddDigits {
	//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수 만들기
	//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        Integer n1 = Integer.valueOf(n);
	        String n2 = n1.toString();
	        String[] num;
	        
	        num = n2.split("");
	        
	        for(int i=0; i<num.length; i++){
	            answer += Integer.parseInt(num[i]);
	        }

	        return answer;
	    }
	}
}
