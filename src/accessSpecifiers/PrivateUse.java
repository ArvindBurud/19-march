package accessSpecifiers;

public class PrivateUse {

	public static void main(String[] args) 
	{
	PrivateUse pu= new PrivateUse();
	pu.test01();
	pu.test02();
	pu.test03();
	pu.test04();

	}
   private void test01()
   {
	 System.out.println("This is private test01 method");  
	   
   }
    void test02()
    {

    System.out.println(" This is default test02 method ");
    }
   protected void test03()
   {
	System.out.println("This is  protected test03 method ");   
	   
   }
   public void test04()
   {
	System.out.println("This is  public test04 method");   
	   
   }
}
