package referencetype_;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ÿ��[] �̸� = �迭 ����
		//Ÿ�� [] �̸� = new Ÿ��[ĭ��] - �迭 �ʱ�ȭ / Ÿ��[] �̸� = {��1, ��2...}; - �ʱ�ȭ2, �����ϴ� ���忡�� ����
		int[] array; // �迭����
		array = new int[3]; // �迭 �ʱ�ȭ
		int[] array2 = {1,2,3,4,5};
		
		//������ �����ʹ� �ּҰ�(�ؽ��ڵ�)�� ���� - ������ ��ȸ�� Ư�� ��ɵ��� �̿��� ����(�ݺ��� ��)
		System.out.println(Arrays.toString(array2));
		
		//2��° �� ��ȸ
		System.out.println(array2[2]);

	}

}
