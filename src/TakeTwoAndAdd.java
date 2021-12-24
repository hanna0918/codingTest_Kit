import java.util.ArrayList;
import java.util.Arrays;

public class TakeTwoAndAdd {
	//두개 뽑아서 더하기
	
	/*
	 *정수 배열 numbers가 주어집니다. 
	 *numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
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
