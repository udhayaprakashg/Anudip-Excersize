
public class Find_Reverse_number {
      public static void main(String args[]) {
    	  int n = 3111, num, reverse =0;
    	  while(n != 0) {
    		  num = n%10;
    		  reverse = (reverse*10) + num;
    		  n = n/10;
    	  }
    	  System.out.println("Reverse of "+ n + " is: "+ reverse);
      }
}
