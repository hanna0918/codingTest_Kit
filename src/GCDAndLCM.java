
public class GCDAndLCM {
	//�ִ������� �ּҰ����
	
	/*
	 * �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. 
	 * �迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
	 * ���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.
	 *
	 */
	
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int y = 0;
        int b = 0;
        
        //�ִ�����
        int min = 0;
        if(n<=m){
            min=n;
        }else{
            min=m;
        }
        
        for(int i=1; i<=min; i++){
            if(n%i==0 && m%i==0){
                y=i;
            }
            answer[0] = y;
        }
        
        //�ּҰ����
        b = (n*m)/y;
        answer[1] = b;
        
        return answer;
    }
	/*
		������ �� �ڿ��� a, b(a > b)�� �־�����
		a�� b�� ���� �������� r(r = a % b)�� �̶�� ����.
		a = b���ǰ� b = r�� �Ǵµ�, �̶� b�� 0�� �� ���� a�� �ִ������̴�.
		
		//�ִ�����
	        int a = Math.max(n, m);
	        int b = Math.min(n, m);
	        while (b != 0) {
	            int r = a % b;
	            a = b;
	            b = r;
	        }
	    // �ּҰ���� = �� ���� ��(a*b) / �ִ�����
	*/
}
