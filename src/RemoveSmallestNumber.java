import java.util.*;

public class RemoveSmallestNumber {

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
