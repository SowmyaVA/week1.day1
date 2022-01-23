package week1.day1;

public class Student {

	String name="Sowmya";
	
	public void collegeName()
	{
		System.out.println("College name is: Sri Sairam college");
	}
	
	private int rollNumber()
	{
		int rollNumber=25276;
		return (rollNumber);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Student std=new Student();
		std.collegeName();
		String studentName=std.name;
		System.out.println("Name of the Student is: "+studentName);
		int collegeRollNumber=std.rollNumber();
		System.out.println("College roll Number is :"+collegeRollNumber);
		
	}
	
	

}
