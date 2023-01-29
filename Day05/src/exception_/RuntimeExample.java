package exception_;

public class RuntimeExample {

	public static void main(String[] args) {
		nullPointerException();

	}
	
	public static void indexExceptionExample() {
		int[] array = new int[3];
		System.out.println(array[5]);
	}
	
	public static void arithmeticExceptionExample() {
		int a = 3;
		int b = 0;
		int c = a/b;
	}
	
	public static void nullPointerException() {
		String a = null;
		System.out.println(a.charAt(0));
	}

}
