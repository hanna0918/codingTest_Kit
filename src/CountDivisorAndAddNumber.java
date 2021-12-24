import java.util.ArrayList;

public class CountDivisorAndAddNumber {
	//약수의 개수와 덧셈
	
	/*
	 * 두 정수 left와 right가 매개변수로 주어집니다. 
	 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
	 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
	
	 * 제한사항
	 * 1 ≤ left ≤ right ≤ 1,000
	*/
	
	 public int solution(int left, int right) {
	        int answer = 0;
	        int num=0;
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        for(int no=left; no<=right; no++){
	            for(int i=1; i<=no; i++){
	                if(no%i==0){
	                    list.add(num);
	                    num++;
	                }
	            }
	            if(list.size()%2==0){
	                answer += no;
	                list.clear();
	            }
	            if(list.size()%2==1){
	                answer -= no;
	                list.clear();
	            }
	        }
	        return answer;
	    }
}
