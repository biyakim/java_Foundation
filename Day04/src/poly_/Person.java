package poly_;

public class Person {
	
	void eat(Fruit fruit) {
		System.out.println("사람이 "+fruit.getName()+"을/를 먹습니다");
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Apple apple = new Apple();
		Orange orange = new Orange();
		
		p1.eat(apple);
		p1.eat(orange);
	}
	
	public String toString() {
		return "이건 사람입니다";
	}
}
