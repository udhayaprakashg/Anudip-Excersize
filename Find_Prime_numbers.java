
public class Find_Prime_numbers {
     public static void main(String[] args) {
	 int n = 47, i = 2, count = 0;
	 while(i < n) { if(n%i == 0) {count ++; break;} i++; }
	 if(count == 0) {System.out.println(n + " is prime number");}
	 else {System.out.println(n + " is not prime number");}
}}
