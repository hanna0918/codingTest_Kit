import java.util.Arrays;
import java.util.Collections;

public class NumberDesc {
	//n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ ����
	//n�� 118372�� 873211�� ����

	class Solution {
		public long solution(long n) {
			long answer = 0;
			String a = Long.toString(n);

			String[] aArr = a.split("");
			Arrays.sort(aArr, Collections.reverseOrder());

			a = String.join("", aArr);

			answer = Long.parseLong(a);

			return answer;
		}
	}
}
