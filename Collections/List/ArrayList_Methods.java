package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_Methods {

	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList<String>();
		
		list.add("Udhaya");
		list.add("Prakash");
		list.add("Gaja");
		list.add("Mani");
		list.add(null);
		
		System.out.println("Output: "+list);
		System.out.println(list.get(0)); //To get the particular element
		System.out.println(list.indexOf("Gaja"));
		
		ArrayList <String> list1 = new ArrayList<String>();//Package import
		
		list1.addAll(list);
		
		System.out.println(list1);
		list1.clear();
		System.out.println(list1);
		
		list1.addAll(list);
		
		list1.remove(4);
		System.out.println(list1);
		
		list1.set(2, "Tamil"); //TO update the particular element
		System.out.println(list1);
		
		System.out.println(list1.isEmpty());
		
		
		//Iterate:
	    //==========
		System.out.println("--------------------------------------");
		System.out.println("Foreach Type:");
		
		for(String i:list1) System.out.println(i);
		System.out.println("--------------------------------------");
		System.out.println("Normal For Loop: ");
		for(int i=0; i<list1.size() ;i++) {
			//System.out.println(i);//Number of indexOf 
			System.out.println(list1.get(i));
		}
		System.out.println("--------------------------------------");
		System.out.println("***ListIterator ");
		
		ListIterator<String> iterator = list1.listIterator(); //Package import
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------------------------------");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		System.out.println("--------------------------------------");
		System.out.println("***Iteration with Iterator");
		Iterator<String> iterator1 = list1.iterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());//There is no reverse
		}
		
		
		//Without Generics: Insert Heterogeneous objects
		
		List n = new ArrayList(); //Insert other data type also but we shouldn't use it
		n.add(1); 
		n.add("Udhaya");
		System.out.println(n);
		
	}

}
