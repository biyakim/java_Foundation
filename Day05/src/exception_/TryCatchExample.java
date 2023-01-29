package exception_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = 0;
		try {
			num = scan.nextInt();
			int ran = (int)Math.random()*2;
			System.out.println(num/ran);
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력하셔야 합니다.");
			System.out.println("기본값 0 할당.");
		}catch(ArithmeticException e) {
			System.out.println("ran이 0으로 할당되었습니다.");
		}finally {
			scan.close();
		}
		
		System.out.println("입력하신 숫자 : "+num);
		

	}

}
