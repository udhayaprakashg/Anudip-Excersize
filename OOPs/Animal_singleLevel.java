
public class Animal_singleLevel {
		void eat() {
			System.out.println("Eating..."); }}
			
			
class Dog extends Animal_singleLevel {
			void bark() {
			System.out.println("barking.."); }}

			
class SingleInheritanceDemo {
			public static void main(String args[]) {
			Dog d=new Dog();
			d.eat(); d.bark();}}
	
