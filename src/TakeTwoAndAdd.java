import java.util.ArrayList;
import java.util.Arrays;

public class TakeTwoAndAdd {
	//�ΰ� �̾Ƽ� ���ϱ�
	
	/*
	 *���� �迭 numbers�� �־����ϴ�. 
	 *numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� �ִ� ��� ���� �迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	*/
	
	public int[] solution(int[] numbers) {
        int[] answer = {};
        int result=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                result = numbers[i]+numbers[j];
                
                if(!(arr.contains(result))){
                    arr.add(result);
                }
            }
        }
        
        answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
