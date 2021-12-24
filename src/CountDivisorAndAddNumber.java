import java.util.ArrayList;

public class CountDivisorAndAddNumber {
	//����� ������ ����
	
	/*
	 * �� ���� left�� right�� �Ű������� �־����ϴ�. 
	 * left���� right������ ��� ���� �߿���, ����� ������ ¦���� ���� ���ϰ�, 
	 * ����� ������ Ȧ���� ���� �� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	
	 * ���ѻ���
	 * 1 �� left �� right �� 1,000
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
