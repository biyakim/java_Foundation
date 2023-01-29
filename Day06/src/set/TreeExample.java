package set;

import java.util.*;

public class TreeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<>();
		set.add(10); set.add(1); set.add(3); set.add(5);
		System.out.println(set);
		
		Set<String> strSet = new TreeSet<>();
		strSet.add("��"); strSet.add("������"); strSet.add("ab");
		strSet.add("12"); strSet.add("����");
		System.out.println(strSet);
		
		for(String data : strSet) {
			System.out.println(data);
		}
		
		Iterator<String> iter = strSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Set<Person> pset = new TreeSet<>();
		pset.add(new Person("����", 19)); pset.add(new Person("����",17));
		System.out.println(pset);
	}

}
