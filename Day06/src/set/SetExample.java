package set;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		System.out.println(set.add("123"));
		System.out.println(set.add("123"));
		System.out.println(set);
		System.out.println(set.contains("123"));
		Set<Integer> lotto = createLotto();
		System.out.println(lotto);
	}
	public static Set<Integer> createLotto(){
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45+1));
		}
		return lotto;
	}

}
