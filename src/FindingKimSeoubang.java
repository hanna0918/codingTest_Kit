
public class FindingKimSeoubang {
	//String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
	//["Jane", "Kim"]	"김서방은 1에 있다"

	class Solution {
	    public String solution(String[] seoul) {
	        String answer = "";
	        
	        for(int i=0; i<seoul.length; i++){
	            if(seoul[i].equals("Kim")){
	                answer = "김서방은 ";
	                answer += i;
	                answer += "에 있다";
	            }   
	        }
	        
	        return answer;
	    }
	}
}
