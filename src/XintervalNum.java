
public class XintervalNum {
	//�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
	//���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++){
            answer[i] = (i+1)*x;
        }
        return answer;
    }
}
