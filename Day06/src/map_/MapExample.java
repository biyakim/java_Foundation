package map_;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("엄영범", 19); map.put("박용준", 100); map.put("김승희", 50);
		System.out.println(map);
		
		map.put("엄영범", 15);
		
		System.out.println(map);
		
		System.out.println(map.get("엄영범"));

		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		Set<String> keySet = map.keySet();
		
		for(Entry<String,Integer> entry : entrySet) {
			System.out.println("키 : "+entry.getKey()+", 값 : "+entry.getValue());

		}
		
		Set<String> KeySet = map.keySet();
		
		for(String key : keySet) {
			System.out.println("키 : "+key+", 값 : "+map.get(key));
		}
	}

}
