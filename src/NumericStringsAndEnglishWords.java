
public class NumericStringsAndEnglishWords {
	//네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
	//1478 → "one4seveneight"
	//234567 → "23four5six7"
	//10203 → "1zerotwozero3"
	//s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        
	        if(s.contains("zero")){
	            s=s.replace("zero", "0");
	        }
	        if(s.contains("one")){
	            s=s.replace("one", "1");
	        }
	        if(s.contains("two")){
	            s=s.replace("two", "2");
	        }
	        if(s.contains("three")){
	            s=s.replace("three", "3");
	        }
	        if(s.contains("four")){
	            s=s.replace("four", "4");
	        }
	        if(s.contains("five")){
	            s=s.replace("five", "5");
	        }
	        if(s.contains("six")){
	            s=s.replace("six", "6");
	        }
	        if(s.contains("seven")){
	            s=s.replace("seven", "7");
	        }
	        if(s.contains("eight")){
	            s=s.replace("eight", "8");
	        }
	        if(s.contains("nine")){
	            s=s.replace("nine", "9");
	        }
	        answer=Integer.parseInt(s);
	        
	        return answer;
	    }
	}
}
