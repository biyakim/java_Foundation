package static_;

import java.util.Arrays;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 호출이 잦은 경우
		System.out.println();
		//2. 매개변수로만 실행되는 경우, 멤버변수(인스턴스변수)를 사용하지 않는 경우
		int ran = (int)(Math.random()*10);
		int[] array = new int[3];
		System.out.println(Arrays.toString(array));
		System.out.println(toString(array));

	}
	public static String toString(int[] array) {
		String result ="[";
		for(int i=0;i<array.length;i++) {
			result +=array[i]+",";
		}
		return result +="]";
	}

}
