package thisAndSuperKeywordUse;

public class ThisUse {
     int a= 100;
     int b= 600;
	public static void main(String[] args) 
	{
ThisUse t= new ThisUse();
t.addition();


	}
   public void addition()
   {
	int a=10;
	int sum= a+100;
	System.out.println("Addition is "+sum);
	
	int sum1= this.a+100;
	System.out.println("Addition is "+sum1);
	 
	
	System.out.println("Local value of a is "+a);
	System.out.println("Global value of a is"+this.a);
   }
   
	
	
	
}
