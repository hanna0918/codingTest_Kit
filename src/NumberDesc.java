import java.util.Arrays;
import java.util.Collections;

public class NumberDesc {
	//n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴
	//n이 118372면 873211을 리턴

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
