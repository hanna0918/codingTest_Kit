import java.util.*;

public class StringDesc {
	//문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수
	//s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        char[] sChar = new char[s.length()];
	        
	        sChar = s.toCharArray();
	        
	        Arrays.sort(sChar);
	        
	        for(int i=sChar.length-1; i>=0; i--){
	            answer += sChar[i];
	        }
	        
	        
	        return answer;
	    }
	}
}
