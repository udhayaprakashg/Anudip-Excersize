
public class Find_palindrome {

	public static void main(String[] args) {
		int n = 3553, remainder, reverse =0;
		int num = n;
		
		while(num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num/10;}
	   if(num == reverse) {System.out.println(n +" is Palindrome");}
	   else { System.out.println(n + " is not palindrome");}
	} }
