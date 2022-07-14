package abstractClass;

public class ConcreatClass extends AbstractStudy
{

	public static void main(String[] args) 
	{
   ConcreatClass a= new ConcreatClass();
 a.test();   
 a.test1();
 a.test2();
 a.sample();
 }
	
public  void test()
{
System.out.println(" This is completed in Concreat Class");	
	
	
}

public void sample()
{
System.out.println("This is sample method of concreat class");	
	
}
}
