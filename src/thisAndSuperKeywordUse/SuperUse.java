package thisAndSuperKeywordUse;

public class SuperUse extends ThisUse{
	int a=500;
	public static void main(String[] args) 
	{
	SuperUse s= new SuperUse();
	s.sub();
		

	}
   public void sub()
   {
	int a=800;
	int sub=a-70;
	System.out.println("Substraction is "+sub);
	
	int sub1=this.a-70;
	System.out.println("Substraction is "+sub1);
	
	int sub2=super.a-70;
	System.out.println("Substraction is "+sub2);
	
   }
}
