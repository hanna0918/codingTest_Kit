
public class GetMiddleLetter {
	//�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. 
	//�ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
	
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
