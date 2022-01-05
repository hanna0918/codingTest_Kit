import java.util.Arrays;

public class KthNumber {
	//k��° ��
	/*
	 *�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.
	 *���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
	 * array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
	 * 1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
	 * 2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
	 *�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, 
	 *commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	 *
	 * commands�� �� ���Ҵ� ���̰� 3�Դϴ�.
	*/
	
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] a = {};
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int idx = commands[i][2];
            
            a = new int[end-start+1];
            a = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(a);
            answer[i] = a[idx-1];
        }
        return answer;
    }
}
