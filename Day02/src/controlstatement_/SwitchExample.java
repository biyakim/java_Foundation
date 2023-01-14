package controlstatement_;
import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요. 숫자 형태만 가능합니다");
		System.out.print("입력 : ");
		int jumsu = scan.nextInt();
		switch(jumsu/10) {
		case 9:
			System.out.printf("점수 : %d. A학점 입니다",jumsu);
			break;
		case 8:
			System.out.printf("점수 : %d. B학점 입니다",jumsu);
			break;
		case 7:
			System.out.printf("점수 : %d. C학점 입니다",jumsu);
			break;
		default:
			System.out.printf("점수 : %d. 재수강 대상 입니다",jumsu);
		
		}
		scan.close();
	}

}
