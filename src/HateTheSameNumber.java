import java.util.ArrayList;

public class HateTheSameNumber {
	/*
	* 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
	* 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
	* arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return
	* arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 
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
