
public class Animal_MultiLevel {
		void eat() {
		System.out.println("Eating..."); }}


class Dog extends Animal_MultiLevel {
		void bark() {
		System.out.println("barking.."); }}
		
		
class Puppy extends Dog {
		void weep() {
		System.out.println("weeping..");}}
		
		
class MultileveInheritanceDemo {
		public static void main(String args[]) {
		Puppy p=new Puppy();
		p.eat(); p.bark(); p.weep(); }}

