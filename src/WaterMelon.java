
public class WaterMelon {
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
