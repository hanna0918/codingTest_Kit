
public class BasicString {
	//���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. 
	//���� ��� s�� "a234"�̸� False�� �����ϰ� "1234"��� True�� ����
	
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
