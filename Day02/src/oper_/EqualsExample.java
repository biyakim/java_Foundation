package oper_;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 1;
		
		System.out.println(a==b);
		
		String c = "a";
		String d = "a";
		//String�� ������������ ���� ���Ǿ� �⺻���� ���� ����� �� �ֵ��� �ϵ�
		System.out.println(c==d);
		
		//�� ������ó�� �����͸� ���� ���� ���� ��Ÿ ������ ���� == ��� �Ұ���
		String e = new String("a");
		System.out.println(c==e);
		//�������� �⺻������ equals() �޼��带 ����� ��
		System.out.println(c.equals(e));

	}

}
