package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) 
	{
	MethodOverloading Mo= new MethodOverloading();
	Mo.add();
	Mo.add(60, 400);
    Mo.add(20, 40, 70);
	}
  public void add()
  {
	int a=25;
	int b=30;
	int sum=a+b;
	System.out.println("Addition is "+sum);
	  
  }
  public void add(int a,int b)
  {
	int sum=a+b;  
	System.out.println("Addition is "+sum);  
  }
  public void add(int a,int b,int c)
  {
	 int sum=a+b+c ;
	 System.out.println("Additon is "+sum);
	  
  }
  
  
}

