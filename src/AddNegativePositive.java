
public class AddNegativePositive {
	//� �������� �ֽ��ϴ�. �� �������� ������ ���ʴ�� ���� ���� �迭 absolutes�� �� �������� ��ȣ�� ���ʴ�� ���� �Ҹ��� �迭 signs�� �Ű������� �־����ϴ�. ���� �������� ���� ���Ͽ� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	//signs[i] �� ���̸� absolutes[i] �� ���� ������ �������, �׷��� ������ �������� �ǹ��մϴ�.

	class Solution {
		public int solution(int[] absolutes, boolean[] signs) {
			int answer = 0;

			for(int i=0; i<absolutes.length; i++){
				if(signs[i]){
					absolutes[i] = 1*absolutes[i];
				}else{
					absolutes[i] = -1*absolutes[i];
				}
				answer += absolutes[i];
			}

			return answer;
		}
	}
}
