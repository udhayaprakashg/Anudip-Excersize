
public class Animal_Hierarchical {
		void eat() {
		System.out.println("Eating..."); }}


		class Dog extends Animal_Hierarchical {
		void bark() {
		System.out.println("barking..");} }
		
		
		class Cat extends Animal_Hierarchical {
		void meow() {
		System.out.println("meowing..");}}
		
		
		class HierarchicalInheritanceDemo {
		public static void main(String args[]) {
		Cat c=new Cat();
		c.meow(); c.eat();}}
