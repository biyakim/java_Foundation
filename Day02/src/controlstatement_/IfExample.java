package controlstatement_;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if(���ǽ�) {} else {} - true�� ��� if, false�� ��� else�� ����(else ��� ��)
		//if () {} else if(���ǽ�) {} -if�� ���ǽ��� ������ ������ �ϴ� ���
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���. ���� ���¸� �����մϴ�");
		System.out.print("�Է� : ");
		int jumsu = scan.nextInt();
		if(jumsu >=90) {
			System.out.printf("���� : %d. A���� �Դϴ�",jumsu);
		}else if(jumsu >=80) {
			System.out.printf("���� : %d. B���� �Դϴ�",jumsu);
		}else if(jumsu >= 70) {
			System.out.printf("���� : %d. C���� �Դϴ�",jumsu);
		}else {
			System.out.printf("���� : %d. ����� ��� �Դϴ�",jumsu);
		}
		scan.close();

	}

}
