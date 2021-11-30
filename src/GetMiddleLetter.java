
public class GetMiddleLetter {
	//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
	//단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        int cnt = s.length();
	        int a = cnt/2;
	        if(cnt%2==1){
	            answer = s.substring(a, a+1);
	        }else{
	            answer = s.substring(a-1, a+1);
	        }
	        return answer;
	    }
	}
}
