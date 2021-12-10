
public class PcountYcount {
	//s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성
	//'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴
	
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        s = s.toUpperCase();
	        
	        int pCount=0;
	        int yCount=0;
	        
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i)==('P')){
	                pCount++;
	            }
	            if(s.charAt(i)==('Y')){
	                yCount++;
	            }
	        }
	        
	        if(pCount==yCount){
	            answer=true;
	        }else{
	            answer=false;
	        }
	        

	        return answer;
	    }
	}
}
