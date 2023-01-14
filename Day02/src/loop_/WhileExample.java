package loop_;

public class WhileExample {

	public static void main(String[] args) {
		
		//while(조건식) {} - 조건식이 true인 경우 계속 실행
		//주로 무한루프에 사용 - break, return 등으로 종료
		int i = 0;
		int sum = 0;
		while(i<10) {
			sum += (i++ +1);
		}
		System.out.println(sum);
		
		//while문 사용 - 1부터 10까지 숫자 출력
		
		int j=0;
		while(j<10) {
			System.out.println(j++ +1);
		}

	}

}
