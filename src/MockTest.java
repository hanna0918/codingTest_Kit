import java.util.Arrays;

public class MockTest {
	//���ǰ��
	
	/* 1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	 * 2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	 * 3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	 * 1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, 
	 * ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	 * 
	 * ���ѻ���
	 * ������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
	 * ���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
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
		Arrays.sort(arr); //��������;;;;;;
		
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
