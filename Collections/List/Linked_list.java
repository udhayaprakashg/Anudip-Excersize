package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
	
	public static void main(String[] args) {


		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		list.addFirst(1);
		System.out.println(list);
		
		list.addLast(5);
		System.out.println(list);
	    
		
		System.out.println("First element: "+list.getFirst());
		System.out.println("Last element: "+list.getLast());
		System.out.println("Second element: "+list.get(1));
		
		System.out.println("Remove First: "+list.removeFirst());
		System.out.println(list);
		System.out.println("Remove Last: "+list.removeLast());
		System.out.println(list);
		
		//poll method and pollfirst() deletes the first element
		
		System.out.println("Poll remove first element: "+list.poll());
		System.out.println(list);
		
		list.add(5);
		list.add(6);
		list.add(7);
		
		System.out.println(list);
		
		//remove by Occurrence
		list.removeFirstOccurrence(5);
		System.out.println(list);
		
		list.removeLastOccurrence(4);
		System.out.println(list);
		
		System.out.println("-------------------------------------------");
		System.out.println("Foreach Stream API");
		//Iterator
		//----------
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Udhaya");
		list1.add("prakash");
		list1.add("Mani");
		list1.add("Gopika");
	    
		System.out.println(list1);
		
		list1.forEach(System.out::println);
		
		//for(int i=0;i<list1.size();i++) {
		//	System.out.println(list1.get(i));}
		
		//for(String i:list1) {
		//	System.out.println(i);}
		System.out.println("---------------------------------");
		System.out.println("While Loop:\n");
		
		
		//Iterator call: No Reverse
		
		Iterator <String> iterator = list1.iterator(); //Without list no reverse
		while(iterator.hasNext()) {
			System.out.println("Iterator output: "+iterator.next());
		}
		
		System.out.println("---------------------------------\n");
	
		
	}
	

} 
