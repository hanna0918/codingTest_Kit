
public class NumericStringsAndEnglishWords {
	//�׿��� ���ε����� ���ڸ� �ǳ� �� �Ϻ� �ڸ����� ���ܾ�� �ٲ� ī�带 �ǳ��ָ� ���ε��� ���� ���ڸ� ã�� �����Դϴ�.
	//1478 �� "one4seveneight"
	//234567 �� "23four5six7"
	//10203 �� "1zerotwozero3"
	//s�� �ǹ��ϴ� ���� ���ڸ� return �ϵ��� solution �Լ��� �ϼ����ּ���.

	/*class Solution {
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
	}*/
	
	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        
	        String[] alphabets = {"zero", "one", "two", "three", "four", "five", 
	                              "six", "seven", "eight", "nine"};
	        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	        
	        for(int i=0; i<num.length; i++){
	            s = s.replaceAll(alphabets[i], num[i]);
	        }
	        answer = Integer.parseInt(s);
	        
	        return answer;
	    }
	}
	
	
}