import java.util.*;

public class RemoveSmallestNumber {
	//���� ���� �� �����ϱ�
	
	/*
	 *������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. 
	 *��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
	 *������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
	 *
	 * ���ѻ���
	 * arr�� ���� 1 �̻��� �迭�Դϴ�.
	 * �ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
	 * 
	 */

	public int[] solution(int[] arr) {
		int[] answer = {};

		ArrayList<Integer> arrList = new ArrayList<Integer>();

		if(arr.length==1){
			answer= new int[1];
			answer[0] = -1;
		}else{
			for(int i:arr){
				arrList.add(i);
			}
			Arrays.sort(arr);
			int a = arr[0];

			System.out.print(a);
			for(int i=0; i<arrList.size(); i++){
				if(arrList.get(i).equals(a)){
					arrList.remove(i);
				}
			}

			answer = new int[arrList.size()];
			int i = 0;
			for (Integer n : arrList) {
				answer[i++] = n;
			}

		}

		return answer;

	}
}
