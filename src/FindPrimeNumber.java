
public class FindPrimeNumber {
	//�Ҽ� ã��
	
	/*
	 *1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.
	 *�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
	 *(1�� �Ҽ��� �ƴմϴ�.)
	*/
	
	public int solution(int n){
        int answer = 0;
        int[] arr = new int[n+1];
        
        for(int i=2; i<=n; i++){
            arr[i] = i;
        }
        
        for(int i=2; i*i<=n; i++){
            if(arr[i]==0){
                continue;
            }
            for(int j=2*i; j<=n; j=j+i){
                arr[j] = 0;
            }
        }
        
        for(int i=2; i<=n; i++){
            if(arr[i]!=0){
                answer++;
            }
        }
        
        return answer;
    }
}
