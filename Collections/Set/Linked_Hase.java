package Set_Method;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hase {
	
	public void exp() {
	Set<Comparable> linkedHaseSet = new LinkedHashSet(); //This also having Less Method
	linkedHaseSet.add("A");
	linkedHaseSet.add("B");
	linkedHaseSet.add("D");
	linkedHaseSet.add("C");
	linkedHaseSet.add(10);
	linkedHaseSet.add(5);
	
	System.out.println(linkedHaseSet);
	
	
	
	
	}
	
	public static void main(String[] args) {
		Linked_Hase obj = new Linked_Hase();
		
		obj.exp();
	}
}
