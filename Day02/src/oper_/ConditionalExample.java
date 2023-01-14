package oper_;

public class ConditionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.random() = 0.0000.. ~ 0.9999.. 까지의 난수 호출
		int ran = (int)(Math.random()*8+1);
		// 조건식(true or false) ? true일 때 값 : false일 때 값 - 3항다항식
		String message = ran%2==0 ? "짝수":"홀수";
		System.out.printf("숫자 : %d. 이 숫자는 %s 입니다.", ran,message);

	}

}
