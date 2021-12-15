import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleArrayOfNumbers {
	//array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ�
	//divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ
	//[5, 9, 7, 10]	 5	[5, 10]
	//[2, 36, 1, 3]	 1	[1, 2, 3, 36]
	//[3,2,6]	10	[-1]

	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	        int[] answer = {};
	        ArrayList<Integer> arrList = new ArrayList<Integer>();
	        
	        for(int i=0; i<arr.length; i++){
	            if(arr[i]%divisor==0){
	                arrList.add(arr[i]);
	            }
	        }
	        if(arrList.isEmpty()){
	            arrList.add(-1);
	        }
	        answer = new int[arrList.size()];
	        
	        for(int i=0; i<arrList.size(); i++){
	            answer[i] = arrList.get(i);
	        }
	        Arrays.sort(answer);
	        
	        return answer;
	    }
	}
}
