package loop_;

public class ForExample {

	public static void main(String[] args) {
		// for(초기값; 조건식; 증감표현식) {}
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum+= i+1;
		}
		System.out.println(sum);

	}

}
