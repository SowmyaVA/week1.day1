
package week1.day1;

public class Mobile 

{

	public void sendMessage()
	{
		System.out.println("Hi John");
	}
	private long saveNumber()
	{
		long mobileNumber=876537352l;
		return(mobileNumber);
		
	}
	private void makeCall()
	{
		System.out.println("calling John");
	}
	
	public static void main(String[] args)
	{
		
		Mobile obj=new Mobile();
		long johnMobileNumber=obj.saveNumber();
		System.out.println("John Mobile Numbe saved: "+johnMobileNumber);
		obj.sendMessage();
		obj.makeCall();
	}
	
}
