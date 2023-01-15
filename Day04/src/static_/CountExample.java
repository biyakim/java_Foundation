package static_;

public class CountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("c1.a : "+c1.a+", c1.b : "+c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("c2.a : "+c2.a+", c2.b : "+c2.b);
		
		Count.b++;

	}

}
