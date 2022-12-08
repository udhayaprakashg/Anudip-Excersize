package Set_Method;

import java.util.HashSet;

public class Hase_Set {
	//NO ORDER
	//STORE AT RANDOM PLACE
	
	public static void main(String[] args) {
		
		HashSet<String> list = new HashSet<String>(); //It comes random wise
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("F");
		list.add("C");
		list.add(null); //Become first
		list.add("A"); // It won't allow any duplicate values
	   
		System.out.println(list);
		
		list.remove(null); //It wont take the index number
		list.remove("A");
		System.out.println(list);
		
		System.out.println(list.size());
		
		list.clear();
		System.out.println(list);
	    
	
	}
    
}
