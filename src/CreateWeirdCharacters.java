
public class CreateWeirdCharacters {
	//�̻��� ���� �����
	
	/*
	 *���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. 
	 *�� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. 
	 *�� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	 *
	 *
	 * ���ѻ���
	 * ���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
	 * ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
	 * 
	*/
	public String solution(String s) {
        String answer = "";
        
        //��� ���� �빮�ڷ� ��ȯ, ����������� �߶� �迭�� ����
        String[] sArr = s.toUpperCase().split(" ",-1);		//�� -1???????
        
        for(int i=0; i<sArr.length; i++){
            String a = sArr[i];
            //�迭 �ܾ� 1���� ������ �ܾ�и� (char�迭�� ���)
            char[] aArr = a.toCharArray();
            for(int j=0; j<aArr.length; j++){
                String b="";
                if(j%2==0){
                    b+=aArr[j];
                }
                if(j%2==1){
                    char ch = aArr[j];
                    ch = (char)(ch+32);
                    b+=ch;
                }
                answer += b;
            }
            answer += " ";
        }
        //������ ���鹮�� �����
        answer = answer.substring(0,answer.length()-1);
        
        return answer;
    }
}
