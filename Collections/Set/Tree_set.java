package Set_Method;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set {
	
	//Generics should be Homogenous and comparable
	//ORDER Wise showing

	public static void main(String[] args) {
		
		TreeSet<Integer> list = new TreeSet<Integer>();
		
		list.add(12);
		list.add(5);
		list.add(10);
		list.add(1);
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(7);
		
		System.out.println(list);
		
		System.out.println("First element: "+list.first());
		System.out.println("Last element: "+ list.last());
	    
		//headSet - show values lesser than given value in this method
		
		System.out.println("Value lesser than 10: "+list.headSet(10));
		
		//tailSet - show equal or greater than value
		
		System.out.println("Value greater or equal to 10: "+list.tailSet(10));
		
		//subset - Show the between value
		
		System.out.println("Values between 5 and 10: "+list.subSet(5, 10));
        
		//comparator:
		
		System.out.println("Comparator returns null if the sorting is default natural order: "+list.comparator());
	    
		System.out.println("Higher value: "+list.higher(1)); //1 after high vale is  3
		
		System.out.println("Lower value: "+list.lower(7));//7 before lower value is 5
	    
		System.out.println("Pollfirst: "+list.pollFirst()); //Remove first
		System.out.println(list);
		
		System.out.println("PollLast: "+list.pollLast()); //Remove last
		System.out.println(list);
		
		System.out.println("Descening set: "+list.descendingSet());
		
		//Normal Iteration:
		//-------------------
		System.out.println("Normla Iterator: ");
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-------------------------------------------");
		
		//descending Iterator
		
		System.out.println("Descending Iterator: ");
		Iterator<Integer> desIterator = list.descendingIterator();
		while(desIterator.hasNext()) {
			System.out.println(desIterator.next());
		}
		
	}
	

}
