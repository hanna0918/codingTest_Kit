import java.util.Calendar;
import java.util.Date;

public class DayOf2016 {
	//2016��
	
	/*
	 * 2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? 
	 * �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	 * ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� "TUE"�� ��ȯ�ϼ���.
	 * 
	 * ��������
	 * 2016���� �����Դϴ�.
	 * 2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�.)
	 */
	public String solution(int a, int b) {
        String answer = "";      
        
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1, b);
        
        Date date = new Date();
        date = cal.getTime();
        answer = date.toString();
        String [] mon = answer.split(" ");
        answer = mon[0].toUpperCase();
        
        
        return answer;
    }
	
}
