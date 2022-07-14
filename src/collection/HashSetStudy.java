package collection;

import java.util.HashSet;

public class HashSetStudy {

	public static void main(String[] args) {
	HashSet hs= new HashSet();
	
     hs.add("Pune");
     hs.add("Pune");
     hs.add(null);
     hs.add(null);
     hs.add(123);
     hs.add(12.23);
     hs.add(true);
     hs.add('A');
     
System.out.println(hs);
System.out.println(hs.size());
System.out.println(hs.contains('B'));
System.out.println(hs.contains("Pune"));
     
	}

}
