package oper_;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 1;
		
		System.out.println(a==b);
		
		String c = "a";
		String d = "a";
		//String은 참조형이지만 많이 사용되어 기본형과 같게 사용할 수 있도록 하둠
		System.out.println(c==d);
		
		//상세 참조형처럼 데이터를 만들어서 쓰는 경우는 기타 참조형 같이 == 사용 불가능
		String e = new String("a");
		System.out.println(c==e);
		//참조형은 기본적으로 equals() 메서드를 사용해 비교
		System.out.println(c.equals(e));

	}

}
