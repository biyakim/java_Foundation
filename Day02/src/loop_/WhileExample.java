package loop_;

public class WhileExample {

	public static void main(String[] args) {
		
		//while(���ǽ�) {} - ���ǽ��� true�� ��� ��� ����
		//�ַ� ���ѷ����� ��� - break, return ������ ����
		int i = 0;
		int sum = 0;
		while(i<10) {
			sum += (i++ +1);
		}
		System.out.println(sum);
		
		//while�� ��� - 1���� 10���� ���� ���
		
		int j=0;
		while(j<10) {
			System.out.println(j++ +1);
		}

	}

}
