
public class InsufficientAmount {
	/*
	  	원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다. 
	  	즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
		놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
		단, 금액이 부족하지 않으면 0을 return 하세요.*/
	// 이용금액이 3인 놀이기구를 4번 타고 싶은 고객이 현재 가진 금액이 20이라면, 총 필요한 놀이기구의 이용 금액은 30 (= 3+6+9+12) 이 되어 10만큼 부족하므로 10을 return
		
	class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = -1;
	        long temp=0;
	        
	        for(long i=1; i<=count; i++){
	            temp += price*i;
	        }
	        
	        if(money-temp<0){
	            answer = (money-temp)*-1;
	        }else{
	            answer=0;
	        }
	        
	        return answer;
	    }
	}
}
