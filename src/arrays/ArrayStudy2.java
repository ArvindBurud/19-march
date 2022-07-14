package arrays;

public class ArrayStudy2 {

	public static void main(String[] args)
	{
		String name[]= new String[5];

		name[0]="Arvind";
		name[1]="Suraj";
		name[2]="Prakash";
		name[3]="Mahesh";
		name[4]="Sujit";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		
		System.out.println("=======================");
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
			
		}
		
		System.out.println("_________________________");
		
		for(int i=name.length-1;i>=0;i--)
		{
			
			System.out.println(name[i]);
		}
		
		
		
		
		
	}

}
