
public class PcountYcount {
	//s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ�
	//'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� ����
	
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        s = s.toUpperCase();
	        
	        int pCount=0;
	        int yCount=0;
	        
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i)==('P')){
	                pCount++;
	            }
	            if(s.charAt(i)==('Y')){
	                yCount++;
	            }
	        }
	        
	        if(pCount==yCount){
	            answer=true;
	        }else{
	            answer=false;
	        }
	        

	        return answer;
	    }
	}
}
