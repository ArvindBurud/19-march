package control_statement;

public class ElseI_Study {

	public static void main(String[] args) {

		// if marks are >=66 then you are dist
		// if marks are >=60 & <66 then you are first class	
		// if marks are >=50 & <60 then you are first class
		// if marks are >40 & <50 then you just pass
		
		int marks=99;
		
		if(marks>=66)
		{
			
		System.out.println("You are in dist");	
		}
		else if(marks>=60 & marks<66)
		{
			System.out.println("You are in First class"); 	
		}
		else if(marks>=50 & marks<60)
		{
			System.out.println("You are in Second class");
		}
		else if(marks>=40 & marks<50)
		{
			System.out.println("You are just pass");
		}
		

	}

}
