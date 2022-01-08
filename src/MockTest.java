import java.util.Arrays;

public class MockTest {
	//모의고사
	
	/* 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
	 * 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	 * 
	 * 제한사항
	 * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
	 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	*/
	public int[] solution(int[] answers) {
		int[] answer = {};

		int[] a = {1,2,3,4,5};//5
		int[] b = {2,1,2,3,2,4,2,5};//8
		int[] c = {3,3,1,1,2,2,4,4,5,5};//10
		int aCnt = 0;
		int bCnt = 0;
		int cCnt = 0;

		for(int i=0; i<answers.length; i++){
			if(answers[i]==a[i%5]){
				aCnt++;
			}
			if(answers[i]==b[i%8]){
				bCnt++;
			}
			if(answers[i]==c[i%10]){
				cCnt++;
			}
		}
		
		int[] arr = new int[3];
		arr[0] = aCnt;
		arr[1] = bCnt;
		arr[2] = cCnt;
		Arrays.sort(arr); //오름차순;;;;;;
		
		if(arr[0]==arr[1]&&arr[0]==arr[2]){
			answer = new int[3];
			answer[0] = 1;
			answer[1] = 2;
			answer[2] = 3;
		}else if(arr[1]==arr[2]&&arr[1]>arr[0]){
			answer = new int[2];
			if(aCnt==bCnt&&bCnt>cCnt){
				answer[0] = 1;
				answer[1] = 2;
			}else if(aCnt==cCnt&&cCnt>bCnt){
				answer[0] = 1;
				answer[1] = 3;
			}else if(cCnt==bCnt&&cCnt>aCnt){
				answer[0] = 2;
				answer[1] = 3;
			}
		}else if(arr[2]>arr[1]){
			answer=new int[1];
			if(arr[2]==aCnt){
				answer[0] = 1;
			}else if(arr[2]==bCnt){
				answer[0] = 2;
			}else{
				answer[0] = 3;
			}
		}

		return answer;
	}
}
