package collection;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {



	public static void main(String[] args) {
	
	Vector v= new Vector();
	
	v.add("Pune");
	v.add('M');
	v.add("Pune");
    v.add(null);
    v.add(null);
    v.add(123);
    v.add(12.223);
    v.add(true);
    
    System.out.println(v);
    
    System.out.println(v.size());
    
    System.out.println(v.isEmpty());
    
    System.out.println(v.remove(0));
    
    System.out.println(v);
    
    System.out.println(v.get(3));
    System.out.println("============================");
    
     for(int i=0; i<=v.size()-1;i++)
    {
	System.out.println(v.get(i));
    }
     System.out.println("============================");
     
    ListIterator lit= v.listIterator();
    while(lit.hasNext())
    {
    System.out.println(lit.next());	
    	
    }
   
	System.out.println("============================");
	
   Enumeration el= v.elements();
   
  while(el.hasMoreElements())
  { 
   
    System.out.println(el.nextElement());
	  }
  
  System.out.println("============================");
  
   Iterator it = v.iterator() ;
   
    while(it.hasNext())
    {
    	 System.out.println(it.next());	
    }
  
    System.out.println("+++++++++++++++++++++++++++++++");
	
    for(Object a:v)
    
    {
    	System.out.println(a);
    }
    
    
    
    
    
	
	}	

}
