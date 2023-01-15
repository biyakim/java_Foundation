package Inheritance.good;

public class Student extends Person {
	
	public int studentId;
	
	public String getDetails() {
		return super.getDetails()+",  �й� : "+this.studentId;
	}
	
	public Student(String name, int age, int studentId) {
		super(name,age);
		this.studentId = studentId;
	}

}
