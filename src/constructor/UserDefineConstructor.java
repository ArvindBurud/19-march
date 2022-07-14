package constructor;

public class UserDefineConstructor {
     
	public UserDefineConstructor()
	{
	System.out.println("I am User Defined Constructor");	
	int a=10;
    int b=20;
    System.out.println("Value of a is "+a);
    System.out.println("Value of b is "+b);
		
		
		
	}
	
	public static void main(String[] args) 
	{
	UserDefineConstructor ud= new UserDefineConstructor();
    ud.test();
	
		
		

	}
    public void test()
    {
    System.out.println("Hi I am the test method");	
    	
    	
    }
	
	
}
