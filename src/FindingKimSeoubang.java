
public class FindingKimSeoubang {
	//String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
	//["Jane", "Kim"]	"�輭���� 1�� �ִ�"

	class Solution {
	    public String solution(String[] seoul) {
	        String answer = "";
	        
	        for(int i=0; i<seoul.length; i++){
	            if(seoul[i].equals("Kim")){
	                answer = "�輭���� ";
	                answer += i;
	                answer += "�� �ִ�";
	            }   
	        }
	        
	        return answer;
	    }
	}
}
