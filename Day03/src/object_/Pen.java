package object_;

public class Pen {
	String color;
	int price;
	
	void write(String message) {
		System.out.println("색깔 : "+color+",내용 : "+message);
	}
	
	//생성자 - 하나도 적지 않는 경우 컴파일러가 기본생성자 생성
	//메서드와 비슷(기능 실행)하지만 결과가 항상 해당 클래스의 객체이기 때문에 이름은 무조건 클래스와 동일
	//여러 개 구현 가능, 한 개라도 구현하면 컴파일러가 기본 생성자 생성하지 않음
	
	Pen(String color, int price){
		this.color = color;
		this.price = price;
	}
}

