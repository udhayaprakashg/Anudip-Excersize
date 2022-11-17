
public class Employee {//Base class
		double salary =40000;
		}


class Company extends Employee { //Sub class
		int bonus=5000;
		public static void main(String args[]) {
		Company i=new Company();
		System.out.println(i.salary);
		System.out.println(i.bonus);}}

