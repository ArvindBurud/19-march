package methods;

public class MathOperation {

	public static void main(String[] args) 
	{
	MathOperation obj= new MathOperation();
	obj.add();
	
	sub();
	
	Sample.mul();
	
	Sample obj2= new Sample();
	obj2.div();
	
			
	
	}
    public void add()
    {
    int a=100;
    int b=45;
    int addition= a+b;
    
    System.out.println("Addition is "+addition);
    	
    	
    }
	
    public static void sub()
    {
    int a= 200;
    int b= 50;
    int substraction= a-b;
    
    System.out.println("Substraction is "+substraction);
    
    	
    	
    }
    
}
