
public class CaesarCipher {
	//������ȣ
	
	/*
	 *� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
	 *���� ��� "AB"�� 1��ŭ �и� "BC"�� �ǰ�, 3��ŭ �и� "DE"�� �˴ϴ�. "z"�� 1��ŭ �и� "a"�� �˴ϴ�. 
	 *���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
	 *
	 *
	 * ���ѻ���
	 * ������ �ƹ��� �о �����Դϴ�.
	 * s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
	 * s�� ���̴� 8000�����Դϴ�.
	 * n�� 1 �̻�, 25������ �ڿ����Դϴ�.
	*/
	
	public String solution(String s, int n) {
        String answer = "";
        char[] sArr = s.toCharArray();
        
        for(int i=0; i<sArr.length; i++){
            char a = sArr[i];
            //�빮���ϰ��
            if(a>=65 && a<=90){
                if(a+n>'Z'){
                    answer += (char)(a-26+n);
                }else{
                    answer +=(char)(a+n);
                }
            }
            //�ҹ����ϰ��
            if(a>=97 && a<=122){
                if(a+n>'z'){
                    answer +=(char)(a-26+n);
                }else{
                    answer +=(char)(a+n);
                }
            }
            if(a==' '){
                answer += a;
            }
        }
        return answer;
    }
}
