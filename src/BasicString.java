
public class BasicString {
	//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
	//예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴
	
	class Solution {
	    public boolean solution(String s) {
	        boolean answer = true;
	        char a;
	        
	        if(s.length() ==4 || s.length()==6){
	            for(int i=0; i<s.length(); i++){
	                a = s.charAt(i);
	                if(Character.isDigit(a)==false){
	                    answer=false;
	                    break;
	                }else{
	                    answer=true;
	                }
	            }
	        }else{
	            answer = false;
	        }
	            
	        return answer;
	    }
	}
}
