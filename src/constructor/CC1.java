package constructor;

public class CC1 {
	int a;
	int b;
	int c;
	
    public CC1() 
    {
    a= 200;
    b= 250;
    	
    }
    public CC1(int p) 
    {
    a=p;	
    	 	
    }

    public CC1(int x,int y)
    {
    a= x;
    b= y;	
    }
   
    public CC1 (int g, int h, int i)
    
    {
    a= g;
    b= h;
    c= i; 	
    	
    }
    public static void main(String[] args) {
	CC1 obj= new CC1();
	obj.add();
	CC1 obj1= new CC1(25);
	obj1.add();
	CC1 obj2= new CC1(35,56);
	obj2.add();
	CC1 obj3= new CC1(54,86,89);
	obj3.add();


	}
    public void add()
    
    {
    int addition= a+b+c;	
    System.out.println("this is addition "+addition);	

    }
    
    
 
    
}
