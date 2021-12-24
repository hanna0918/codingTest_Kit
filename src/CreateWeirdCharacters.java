
public class CreateWeirdCharacters {
	//이상한 문자 만들기
	
	/*
	 *문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
	 *각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
	 *각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	 *
	 *
	 * 제한사항
	 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
	 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
	 * 
	*/
	public String solution(String s) {
        String answer = "";
        
        //모든 문자 대문자로 변환, 공백기준으로 잘라서 배열에 담음
        String[] sArr = s.toUpperCase().split(" ",-1);		//왜 -1???????
        
        for(int i=0; i<sArr.length; i++){
            String a = sArr[i];
            //배열 단어 1개씩 꺼내서 단어분리 (char배열에 담기)
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
        //마지막 공백문자 지우기
        answer = answer.substring(0,answer.length()-1);
        
        return answer;
    }
}
