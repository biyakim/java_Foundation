package controlstatement_;
import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���. ���� ���¸� �����մϴ�");
		System.out.print("�Է� : ");
		int jumsu = scan.nextInt();
		switch(jumsu/10) {
		case 9:
			System.out.printf("���� : %d. A���� �Դϴ�",jumsu);
			break;
		case 8:
			System.out.printf("���� : %d. B���� �Դϴ�",jumsu);
			break;
		case 7:
			System.out.printf("���� : %d. C���� �Դϴ�",jumsu);
			break;
		default:
			System.out.printf("���� : %d. ����� ��� �Դϴ�",jumsu);
		
		}
		scan.close();
	}

}
