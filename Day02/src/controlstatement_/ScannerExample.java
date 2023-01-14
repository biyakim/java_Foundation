package controlstatement_;
import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = scan.nextLine();
		System.out.println("입력값 : "+ input);
		scan.close();
		

	}

}
