
public class String_IsPalindrome {

	public static void main(String[] args) {
	      
	      String name = "Udhaya";
	      String reverse = "";
	      
	      int strLength = name.length();

	      for (int i = (strLength - 1); i >=0; --i) {
	        reverse = reverse + name.charAt(i);
	      }

	      if (name.toLowerCase().equals(reverse.toLowerCase())) {
	        System.out.println(name + " is a Palindrome String");
	      }
	      else {
	        System.out.println(name + " is not a Palindrome String");
	      }
	}

}
