
public class EvenOdd {
	//���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	public String solution(int num) {
        String answer = "";
        
        if(num%2==0){
            answer="Even";
        }else{
            answer="Odd";
        }
        return answer;
	}
}
