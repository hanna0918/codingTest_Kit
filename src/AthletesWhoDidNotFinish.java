import java.util.HashMap;

public class AthletesWhoDidNotFinish {
	//완주하지 못한 선수
	
	/*
	 *수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
	 *단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
	 *마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
	 *완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
	 *
	 *참가자 중에는 동명이인이 있을 수 있습니다.
	*/
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        //		<key,	value>
        for(String a:participant){
            hm.put(a, hm.getOrDefault(a, 0)+1);
            //			getOrDefault(값, 값이 존재하는 경우 기본값)
        }
        for(String a:completion){
            hm.put(a, hm.get(a)-1);
            //			get() -> value값을 리턴
        }
        for(String key:hm.keySet()){
        	//			 keySet() -> key값을 set형태로 리턴
            if(hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
