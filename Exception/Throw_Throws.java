package Exception;

public class Throw_Throws {

	    static void fun() throws IllegalAccessException
	    {
	        System.out.println("Hello Opening this fun");
	        throw new IllegalAccessException("Exception Occured");
	    }
	    
	    public static void main(String args[])
	    {
	        try
	        {
	            fun();
	        }
	        catch(IllegalAccessException e)
	        {
	            System.out.println("caught in main.");
	        }
	    }
	}

