package static_;

import java.util.Arrays;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. ȣ���� ���� ���
		System.out.println();
		//2. �Ű������θ� ����Ǵ� ���, �������(�ν��Ͻ�����)�� ������� �ʴ� ���
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
