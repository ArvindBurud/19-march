package logicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		Scanner src= new Scanner(System.in);
		System.out.println("Enter value of a");
		
		int a = src.nextInt();
		  System.out.println("Enter value of b");
        int b = src.nextInt();
      
        int sum=a+b;
        System.out.println("Addition is "+sum);
	}

}
