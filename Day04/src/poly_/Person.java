package poly_;

public class Person {
	
	void eat(Fruit fruit) {
		System.out.println("����� "+fruit.getName()+"��/�� �Խ��ϴ�");
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Apple apple = new Apple();
		Orange orange = new Orange();
		
		p1.eat(apple);
		p1.eat(orange);
	}
	
	public String toString() {
		return "�̰� ����Դϴ�";
	}
}
