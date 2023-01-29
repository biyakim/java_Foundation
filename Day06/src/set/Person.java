package set;

import java.util.Objects;

public class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if(age != other.age)
			return false;
		if(name == null) {
			if(other.name !=null)
				return false;
		}else if(!name.equals(other.name))
			return false;
		return true;
		
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
}
