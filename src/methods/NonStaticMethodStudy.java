package methods;

public class NonStaticMethodStudy {

	public static void main(String[] args) 
	{
	//classname objname= new classname();
    //to non static method objnamme.methodname();
		NonStaticMethodStudy obj= new NonStaticMethodStudy();
		obj.display();
		
		AnotherClass m= new AnotherClass(); //created obj of another class
		m.calculation();                    //calling non ststic method from another class
		
		
		
		
	}
   public void display() 
   {
	 System.out.println("Hi this non ststic method study");  
	   
	   
   }
  
}
