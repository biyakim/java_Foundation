package object_;

public class Pen {
	String color;
	int price;
	
	void write(String message) {
		System.out.println("���� : "+color+",���� : "+message);
	}
	
	//������ - �ϳ��� ���� �ʴ� ��� �����Ϸ��� �⺻������ ����
	//�޼���� ���(��� ����)������ ����� �׻� �ش� Ŭ������ ��ü�̱� ������ �̸��� ������ Ŭ������ ����
	//���� �� ���� ����, �� ���� �����ϸ� �����Ϸ��� �⺻ ������ �������� ����
	
	Pen(String color, int price){
		this.color = color;
		this.price = price;
	}
}

