package oper_;

public class ConditionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.random() = 0.0000.. ~ 0.9999.. ������ ���� ȣ��
		int ran = (int)(Math.random()*8+1);
		// ���ǽ�(true or false) ? true�� �� �� : false�� �� �� - 3�״��׽�
		String message = ran%2==0 ? "¦��":"Ȧ��";
		System.out.printf("���� : %d. �� ���ڴ� %s �Դϴ�.", ran,message);

	}

}
