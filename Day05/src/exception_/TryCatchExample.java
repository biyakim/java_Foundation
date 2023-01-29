package exception_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = 0;
		try {
			num = scan.nextInt();
			int ran = (int)Math.random()*2;
			System.out.println(num/ran);
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
			System.out.println("�⺻�� 0 �Ҵ�.");
		}catch(ArithmeticException e) {
			System.out.println("ran�� 0���� �Ҵ�Ǿ����ϴ�.");
		}finally {
			scan.close();
		}
		
		System.out.println("�Է��Ͻ� ���� : "+num);
		

	}

}
