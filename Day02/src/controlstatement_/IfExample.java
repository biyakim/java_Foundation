package controlstatement_;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if(조건식) {} else {} - true인 경우 if, false인 경우 else안 실행(else 없어도 됨)
		//if () {} else if(조건식) {} -if의 조건식을 여러개 쓰려고 하는 경우
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요. 숫자 형태만 가능합니다");
		System.out.print("입력 : ");
		int jumsu = scan.nextInt();
		if(jumsu >=90) {
			System.out.printf("점수 : %d. A학점 입니다",jumsu);
		}else if(jumsu >=80) {
			System.out.printf("점수 : %d. B학점 입니다",jumsu);
		}else if(jumsu >= 70) {
			System.out.printf("점수 : %d. C학점 입니다",jumsu);
		}else {
			System.out.printf("점수 : %d. 재수강 대상 입니다",jumsu);
		}
		scan.close();

	}

}
