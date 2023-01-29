package map_;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("������", 19); map.put("�ڿ���", 100); map.put("�����", 50);
		System.out.println(map);
		
		map.put("������", 15);
		
		System.out.println(map);
		
		System.out.println(map.get("������"));

		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		Set<String> keySet = map.keySet();
		
		for(Entry<String,Integer> entry : entrySet) {
			System.out.println("Ű : "+entry.getKey()+", �� : "+entry.getValue());

		}
		
		Set<String> KeySet = map.keySet();
		
		for(String key : keySet) {
			System.out.println("Ű : "+key+", �� : "+map.get(key));
		}
	}

}
