package question_;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		int index = 0;
		
		while(true){
			int ran = (int)(Math.random()*45+1);
			int i=0;
			for(i=0;i<index;i++)
				if(ran==lotto[i]) {
					break;
				}
			if(i==index) {
				lotto[index++] = ran;
			}
			if(index > 5) {
				break;
			}
		}
		System.out.println("로또 번호 : "+Arrays.toString(lotto));
	}

}
