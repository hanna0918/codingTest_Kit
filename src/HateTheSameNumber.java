import java.util.ArrayList;

public class HateTheSameNumber {
	/*
	* �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�.
	* ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�.
	* arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return
	* arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return 
	*/
	
	public int[] solution(int []arr) {
		int[] answer = {};

		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i=0; i<=arr.length-2; i++){
			if(arr[i]!=arr[i+1]){
				list.add(arr[i]);
			}
			if(i==arr.length-2){
				list.add(arr[arr.length-1]);
			}

		}

		answer = new int[list.size()];
		for(int i=0; i<list.size(); i++){
			answer[i] = list.get(i).intValue();
		}

		return answer;

	}
}
