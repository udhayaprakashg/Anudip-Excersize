record Person(String name, double weight, double height, String foodhabbit) {
Person() {
this("Udhaya",75,182,"Non-Veg"); }


public static void main(String args[]) {
Person c=new Person();
System.out.println(c);
Person p=new Person("Udhaya",62.35,75,"Non-Veg");
System.out.println(p);
Person p1=new Person("Prakash",59,165,"Veg");
System.out.println(p1);
}
}



