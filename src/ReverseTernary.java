
public class ReverseTernary {
	//3���� ������
	
	/*
	 * �ڿ��� n�� �Ű������� �־����ϴ�. 
	 * n�� 3���� �󿡼� �յڷ� ������ ��, �̸� �ٽ� 10�������� ǥ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 * 
	 */
	
	public int solution(int n) {
        int answer = 0;
        String na = "";
        
        while(n>0){
            na += ((n%3)+"");
            n = n/3;
        }
        
        answer = Integer.parseInt(na, 3);
        
        return answer;
    }
}
