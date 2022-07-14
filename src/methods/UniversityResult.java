package methods;

public class UniversityResult {

	public static void main(String[] args) 
	
	{
	UniversityResult ur= new UniversityResult();//Calling method without parameter
	ur.studentInfo();
	
	ur.studentInfo1("Amar",124,'B',260.78f);//Calling method with parameter
	ur.studentInfo1("Pradip", 129, 'B', 265.33f);
	ur.studentInfo1("rames", 64, 'A', 280.24f);
		
		
	

	}
	public void studentInfo() {
		
	
		 String StudentName= "Velocity";
		    int RollNum= 123;
		    char grade='A';
		    float totalMarks= 280.34f;
		    
	System.out.println("=====================================");	    
	System.out.println("Student's name is "+StudentName);
	System.out.println("Student's Roll no. is "+RollNum);
	System.out.println("Student's grade is "+grade);
	System.out.println("Student's total marks is "+totalMarks);
	System.out.println("=====================================");
	
	}
	public void studentInfo1(String StudentName,int RollNum,char grade,float totalMarks)
	{
		System.out.println("=====================================");	    
		System.out.println("Student's name is "+StudentName);
		System.out.println("Student's Roll no. is "+RollNum);
		System.out.println("Student's grade is "+grade);
		System.out.println("Student's total marks is "+totalMarks);
		System.out.println("=====================================");
			
		
		
		
		
	}
   
 
	
	
	
}
