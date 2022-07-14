package finalKeywordUse;

public class Test {

	public static void main(String[] args) 
	{
	  int a=10;
	   a=a+20;
	  System.out.println("Value of a is "+a);
		
	  final int b=40;  //If final keyword use then we can update value of variable
	  int sum= a+b;
		System.out.println("Sum is "+sum);
	}
      public final void demo()
      {
    	  System.out.println("This is demo method of Test class ");
      }
}
