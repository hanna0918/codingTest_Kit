import java.util.*;

public class StringDesc {
	//���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�
	//s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ ����

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        char[] sChar = new char[s.length()];
	        
	        sChar = s.toCharArray();
	        
	        Arrays.sort(sChar);
	        
	        for(int i=sChar.length-1; i>=0; i--){
	            answer += sChar[i];
	        }
	        
	        
	        return answer;
	    }
	}
}
