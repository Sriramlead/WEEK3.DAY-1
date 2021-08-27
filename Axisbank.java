package week3.day1;

public class Axisbank extends Bankinfo{
	public  void deposit ()
	{
		 
		System.out.println(" Overriding Deposit Account");
	
	}

public static void main(String[] args)

{
	Axisbank AX = new Axisbank();
	AX.saving();
	AX.fixed();
		AX.deposit();
}


}
	
	


