package constructor;

public class NestedIf_Else {

	public static void main(String[] args) {


		
		
	String USR= "Maharashtra123";
	String PWD= "Pune@1121";
	
	if( USR=="Maharashtra123")
	{
	System.out.println("Enter password");	
	if(PWD== "Pune@112")
		System.out.println("you are login sucessfully");
	else 
	{
		System.out.println("Enter correct password");	
	}
	}
	else
	{
		System.out.println("Enter correct Uername");	
	}
}
}