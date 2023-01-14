package referencetype_;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//타입[] 이름 = 배열 선언
		//타입 [] 이름 = new 타입[칸수] - 배열 초기화 / 타입[] 이름 = {값1, 값2...}; - 초기화2, 선언하는 문장에만 가능
		int[] array; // 배열선언
		array = new int[3]; // 배열 초기화
		int[] array2 = {1,2,3,4,5};
		
		//참조형 데이터는 주소값(해쉬코드)를 보유 - 데이터 조회는 특정 기능들을 이용해 가능(반복문 등)
		System.out.println(Arrays.toString(array2));
		
		//2번째 값 조회
		System.out.println(array2[2]);

	}

}
