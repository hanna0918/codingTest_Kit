
public class AddDigits {
	//�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ� �����
	//������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        Integer n1 = Integer.valueOf(n);
	        String n2 = n1.toString();
	        String[] num;
	        
	        num = n2.split("");
	        
	        for(int i=0; i<num.length; i++){
	            answer += Integer.parseInt(num[i]);
	        }

	        return answer;
	    }
	}
}
