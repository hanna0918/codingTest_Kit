
public class WaterMelon {
	//���̰� n�̰�, "���ڼ��ڼ��ڼ�...."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	//������� n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� �˴ϴ�.
	
	public String solution(int n) {
        String answer = "";
        String waterMelon = "����";
        int m = n%2;
        n = n/2;
        
        if(m==0){
            answer=waterMelon.repeat(n);
        }else{
            answer=waterMelon.repeat(n)+"��";
        }
        
        return answer;
    }
}
