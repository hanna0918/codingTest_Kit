import java.util.Calendar;
import java.util.Date;

public class DayOf2016 {
	//2016년
	
	/*
	 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
	 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
	 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
	 * 
	 * 제한조건
	 * 2016년은 윤년입니다.
	 * 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다.)
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
