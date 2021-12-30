
public class GCDAndLCM {
	//최대공약수와 최소공배수
	
	/*
	 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
	 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
	 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
	 *
	 */
	
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int y = 0;
        int b = 0;
        
        //최대공약수
        int min = 0;
        if(n<=m){
            min=n;
        }else{
            min=m;
        }
        
        for(int i=1; i<=min; i++){
            if(n%i==0 && m%i==0){
                y=i;
            }
            answer[0] = y;
        }
        
        //최소공배수
        b = (n*m)/y;
        answer[1] = b;
        
        return answer;
    }
}
