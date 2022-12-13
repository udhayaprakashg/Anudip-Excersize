
import java.util.*;
import java.util.stream.Collectors;

class treeMap{
public static void main(String args[]){
     
	 TreeMap<Integer,String> tm = new TreeMap<>();
	 
	 tm.put(1,"Udhaya");
	 tm.put(6,"Prakash");
	 tm.put(2,"Gopika");
	 tm.put(4,"Vinothini");
	 
	 
	 System.out.println("\nOutput Result: ");
	 for(Map.Entry t:tm.entrySet()){
	 System.out.println(t.getKey()+" "+t.getValue());
	 }
	 
	 tm.remove(6);
	 
	 System.out.println("\nRemoved output Result: ");
	 for(Map.Entry t:tm.entrySet()){
	 System.out.println(t.getKey()+" "+t.getValue());
	 }
	 
	 tm.put(10,"Kathiravan");
	 tm.put(13,"Valli");
	 tm.put(9,"Swasthika");
	 //System.out.println("\nReverse Order using Stream output Result: ");
	 //tm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	 
	 //-------------------NavigableMap---------------------------
	 //Maintain Descending order
	 System.out.println("Descending order: "+tm.descendingMap());
	 //Returns key-value pairs whose keys are less than or equal to the specified key
	 System.out.println("headMap: "+tm.headMap(6,true));
	 //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	 System.out.println("headTail: "+tm.tailMap(6,true));
	  //Returns key-value pairs exists in between the specified key.  
	  System.out.println("subMap: "+tm.subMap(2,true,10,true));
	 
	 //--------------------Sorted Map------------------------------
	 //Returns key-value pairs whose keys are less than the specified key.  
      System.out.println("headMap: "+tm.headMap(4));  
      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
      System.out.println("tailMap: "+tm.tailMap(10));  
      //Returns key-value pairs exists in between the specified key.  
      System.out.println("subMap: "+tm.subMap(4, 9));   
	  
	  //-----------------Map with List------------------------------
	  
	  TreeMap<Integer,List<String>> m = new TreeMap<Integer,List<String>>();
	  List<String> li = new ArrayList<String>();
	  li.add("A.Primary");
	  li.add("D.Secondary");
	  li.add("C.Teritary");
	  li.add("B.Quantranary");
	  
	  //Sorting the elements
	  List<String> so = li.stream().sorted().collect(Collectors.toList());
	  
	  //Sort by compareTo
	  List<String> com = li.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	  
	  //Adding element to m (TreeMap)
	  
	  m.put(1,li);
	  m.put(3,com);
	  m.put(2,so);
	  System.out.print("\n");
	  for(Map.Entry out:m.entrySet()){
		  System.out.println(out.getKey()+" "+out.getValue());
	  }
	  
	 
}
}