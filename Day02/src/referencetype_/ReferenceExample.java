package referencetype_;

import java.util.Arrays;

public class ReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array1 = {1,2,3,4,5,6,7};
		int[] array2  = array1;
		System.out.println(Arrays.toString(array2));
		array1[2] = 8;
		array1[5] = 9;
		System.out.println(Arrays.toString(array2));
		
		
	}

}
