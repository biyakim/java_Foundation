package Inheritance.good;

public class Person {
	
	public String name;
	public int age;
	
	public String getDetails() {
		return "이름 : "+this.name+", 나이 : "+this.age;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Person() {
		
	}
	
	public String toString() {
		return "Person [name=" + name+", age="+age +"]";
	}

}
