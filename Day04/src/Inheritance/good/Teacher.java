package Inheritance.good;

public class Teacher extends Person{
	 
	public String subject;
	
	public String getDetails() {
		return super.getDetails()+", °ú¸ñ : "+this.subject;
	}
	
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
		
	}

}
