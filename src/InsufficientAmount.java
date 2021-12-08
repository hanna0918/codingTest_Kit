
public class InsufficientAmount {
	/*
	  	���� �̿��� price�� �ε�, ���̱ⱸ�� N �� ° �̿��Ѵٸ� ���� �̿���� N�踦 �ޱ�� �Ͽ����ϴ�. 
	  	��, ó�� �̿�ᰡ 100�̾��ٸ� 2��°���� 200, 3��°���� 300���� ����� �λ�˴ϴ�.
		���̱ⱸ�� count�� Ÿ�� �Ǹ� ���� �ڽ��� ������ �ִ� �ݾ׿��� �󸶰� ���ڶ������ return �ϵ��� solution �Լ��� �ϼ��ϼ���.
		��, �ݾ��� �������� ������ 0�� return �ϼ���.*/
	// �̿�ݾ��� 3�� ���̱ⱸ�� 4�� Ÿ�� ���� ���� ���� ���� �ݾ��� 20�̶��, �� �ʿ��� ���̱ⱸ�� �̿� �ݾ��� 30 (= 3+6+9+12) �� �Ǿ� 10��ŭ �����ϹǷ� 10�� return
		
	class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = -1;
	        long temp=0;
	        
	        for(long i=1; i<=count; i++){
	            temp += price*i;
	        }
	        
	        if(money-temp<0){
	            answer = (money-temp)*-1;
	        }else{
	            answer=0;
	        }
	        
	        return answer;
	    }
	}
}
