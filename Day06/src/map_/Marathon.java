package map_;

import java.util.*;

public class Marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participants = {"mislav","stanko","mislav","ana"};
		String[] completion = {"mislav", "stanko","ana"};
		String result = solution(participants, completion);
		System.out.println("°á°ú : "+result);

	}
	public static String solution(String[] participant, String[] completion) {
		Map<String, Integer> map = new HashMap<>();
		
		for(String part : participant) {
			map.put(part, map.getOrDefault(part, 0)+1);
		}
		
		System.out.println(map);
		
		for(String key : map.keySet()) {
			if(map.get(key)==1) {
				return key;
			}
		}
		
		return null;
	}

}
