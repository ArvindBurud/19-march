package constructor;

public class Hr_Portal {

	public static void main(String[] args) {
		
	Employee SachinT= new Employee();
	
	SachinT.emp_name="Sachin Tendulkar";
    SachinT.emp_id= 10;
    SachinT.emp_dept= "Batting";
    SachinT.emp_sal= 12435.24587f;
    SachinT.gender= 'M';
    
    
Employee Zaheer= new Employee();
	
	Zaheer.emp_name="Zaheer Khan";
    Zaheer.emp_id= 1;
    Zaheer.emp_dept= "Bowling";
    Zaheer.emp_sal= 165535.24587f;
    Zaheer.gender= 'M';
     
    SachinT.emp_info();
    Zaheer.emp_info();
    		
    
    
    
		
		
		
		
		
		

	}

}
