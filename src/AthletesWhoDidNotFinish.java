import java.util.HashMap;

public class AthletesWhoDidNotFinish {
	//�������� ���� ����
	
	/*
	 *������ ������ �������� �����濡 �����Ͽ����ϴ�. 
	 *�� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
	 *�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
	 *�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	 *
	 *������ �߿��� ���������� ���� �� �ֽ��ϴ�.
	*/
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        //		<key,	value>
        for(String a:participant){
            hm.put(a, hm.getOrDefault(a, 0)+1);
            //			getOrDefault(��, ���� �����ϴ� ��� �⺻��)
        }
        for(String a:completion){
            hm.put(a, hm.get(a)-1);
            //			get() -> value���� ����
        }
        for(String key:hm.keySet()){
        	//			 keySet() -> key���� set���·� ����
            if(hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
