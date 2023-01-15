package Inheritance.good;

import java.awt.Frame;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("����", 17);
		Student s1 = new Student("����",17, 2005);
		Teacher t1 = new Teacher("������",20,"Java");
		
		System.out.println(p1.getDetails());
		System.out.println(s1.getDetails());
		System.out.println(t1.getDetails());
		
		Person p2 = (Person)s1;
		System.out.println(p2.getDetails());
		Person p3 = (Person)t1;
		System.out.println(p3.getDetails());
		

	}

}
