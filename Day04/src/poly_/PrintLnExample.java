package poly_;

public class PrintLnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println(p1);
		myPrintln(p1);
		String a = new String("a");
		System.out.println(a);
		
		
	}
	public static void myPrintln(Object object) {
		System.out.println(object.toString());
	}

}
