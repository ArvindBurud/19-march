package constructor;

public class DefaultConstructor {
     public DefaultConstructor() 
     {
   	 System.out.println("this is User Define");
    	 
    	 
     }
     
	public static void main(String[] args) 
	{
		DefaultConstructor t= new DefaultConstructor();// object created 
		t.myMethod();// calling non static method
		t.add();
		
		

	}
    public void myMethod() 
    
    {
    	System.out.println("This is a Default constructor example");
    	
    }
    public  void add() 
    {
    int a= 25;
    int b= 30;
    int addition= a+b;
    System.out.println("this is addition "+addition);
    
    
    	
    }
    
    
    
    
    
    
    
}
