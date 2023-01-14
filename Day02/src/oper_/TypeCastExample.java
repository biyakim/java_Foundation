package oper_;

public class TypeCastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(타입) - 형변환
		int a = 1;
		byte b = (byte)a; // 형변환 적용
		
		byte c =1;
		int d = c;
		
		int e  = 123812;
		byte f = (byte)e; //형변환 시 비트를 강제로 자름 - 값이 변할 수 있음
		
		
		System.out.println(f);

	}

}
