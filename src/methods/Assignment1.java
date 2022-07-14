package methods;

public class Assignment1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	Assignment1 obj= new Assignment1();
	obj.calculator(200,10);
	obj.calculator(300, 15);
	obj.calculator(625, 25);
	
		
		
		

	}
   public void calculator(int a, int b )  
   {
	System.out.println("========================");   
	System.out.println("Addition is "+(a+b));   
	System.out.println("Substraction is "+(a-b));
	System.out.println("Multiplication is "+(a*b));
	System.out.println("Division is "+(a/b));
	System.out.println("=========================");
	
   }
	
	
}
