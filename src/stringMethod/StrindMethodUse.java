package stringMethod;

public class StrindMethodUse {

	public static void main(String[] args) 
	{
		String name="Pune";
		
		System.out.println(name.length());  
		int a= name.length();
		System.out.println(a);
		System.out.println("=====================");
		
		System.out.println(name.toUpperCase());
		
		System.out.println("=========================");
		
		System.out.println(name.toLowerCase());
		System.out.println("=======================");

	String x="Velocity";
	String y="Velocity";
	String p=new String("Velocity");
	String q=new String("Velocity");
	String r=new String("VELOCITY");
	
	System.out.println(x==y);
	System.out.println(y==p);
	System.out.println(p==q);
	System.out.println(q==r);
	System.out.println(x.equals(y));
	System.out.println(x.equals(p));
	System.out.println(x.equals(r));
	
	}

}
