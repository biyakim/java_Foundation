package set;

import java.util.*;

public class HshExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("���",19);
		Person p2 = new Person("���",17);
		Set<Person> set = new HashSet<>();
		set.add(p1); set.add(p2);
		
		System.out.println(set.size());
		System.out.println(set);

	}

}
