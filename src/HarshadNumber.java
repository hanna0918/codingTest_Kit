
public class HarshadNumber {
	//�ϻ��� ��
	/*
	 * ���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
	 * ���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
	 * �ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ�
	*/
	
	//��������
	//x�� 1 �̻�, 10000 ������ �����Դϴ�.
	
	public boolean solution(int x) {
        boolean answer = true;
        int a = 0;
        
        String xString = x+"";
        String[] xStringArr = xString.split("");
        for(int i=0; i<xStringArr.length; i++){
            a += Integer.parseInt(xStringArr[i]);
        }
        if(x%a==0){
            answer=true;
        }else{
            answer=false;
        }
        return answer;
    }
}
