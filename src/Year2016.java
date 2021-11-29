
public class Year2016 {

	class Solution {
	    public String solution(int a, int b) {
	        String answer = "";
	        switch(a){
	            case 1 : 
	            case 3 : 
	            case 5 : 
	            case 7 : 
	            case 8 : 
	            case 10 :
	            case 12 : 
	                b=31;
	                break;
	            case 2 :
	                b= 29;
	                break;
	            default : 
	                b = 30;
	                break;
	        }
	        return answer;
	    }
	}
}
