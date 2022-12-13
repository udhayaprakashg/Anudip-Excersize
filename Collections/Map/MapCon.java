
import java.util.*;

class MapCon{
public static void main(String args[]){
   //Creating book object
   Map<Integer,Book> map = new Hashtable<Integer,Book>();
   
  Book b1 = new Book(1,"Udhaya",20,120);
  Book b2 = new Book(2,"Prakash",22,100);
  Book b3 = new Book(3,"Thaniyan",19,140);
  
  map.put(1,b1);
  map.put(2,b2);
  map.put(3,b3);
  
  for(Map.Entry<Integer,Book> o:map.entrySet()){
	  int key = o.getKey();
	  Book b=o.getValue();
	   System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.age+" "+b.quantity);   
  }
  
  Map<String,String> m = new HashMap<>();
  m.put("1","Sundara chozhan");
  m.put("2","Arulmozhi");
  m.put("3","Aditya karikalan");
  
  Optional<String> optional =m.entrySet().stream().filter(e->"Arulmozhi".equals(e.getValue())).map(Map.Entry::getValue) //You can use Map.Entry::getKey
                               .findFirst(); 
  m.put("4", optional.get());
  
  System.out.println("\n Optional used in last one(4): ");
  for(Map.Entry o:m.entrySet()){
	  System.out.println(o.getKey()+" "+o.getValue());
  }
  
   
}
}


class Book{
int id;
String name;
int age;
int quantity;

Book(int a, String b, int c, int d){
this.id =a;
this.name = b;
this.age = c;
this.quantity=d;
}
}