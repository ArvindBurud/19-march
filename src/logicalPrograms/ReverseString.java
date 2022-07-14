
package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner scr= new Scanner(System.in);
		System.out.println("please enter value");
		String a = scr.next();
		
        String b="";
      for(int i=a.length()-1;i>=0;i--) 
      {
    	 b= b+a.charAt(i);
    	  
      }
        System.out.println("Original String is "+a);
        System.out.println("Revese String is "+b);
        
	}

}
