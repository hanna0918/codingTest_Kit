
public class HidePhoneNumber {
	//화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성
	//"01033334444" => "*******4444"	/	"027778888" => "*****8888"
	
	class Solution {
	    public String solution(String phone_number) {
	        String answer = "*";
	        int length = phone_number.length();
	        
	        String last_num = phone_number.substring(length-4, length);
	        
	        String number = phone_number.substring(0, length-4);
	        
	        answer = answer.repeat(number.length())+last_num;
	        
	        return answer;
	    }
	}
}
