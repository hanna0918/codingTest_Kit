
public class HidePhoneNumber {
	//ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ�
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
