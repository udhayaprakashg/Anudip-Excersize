
public class Excersize_String {

	public static void main(String[] args) {
		
		String name1 = "Udhayaprakash";
		String name2 = "udhaya";
		
	    System.out.println("Convert to String: "+ name1.toString());
		System.out.println("Equal: "+name1.equals(name2));
		System.out.println("Equals w/o case sensitive: "+name1.equalsIgnoreCase(name2));
		System.out.println("Comparison: "+name1.compareTo(name2));
		System.out.println("Compare w/o case sensitive: "+name1.compareToIgnoreCase(name2));
		System.out.println("Find the character: "+name1.charAt(0));
		System.out.println("Name contains: "+name1.contains("pra"));
		System.out.println("Startswith: "+name1.startsWith("U"));
		System.out.println("Ends with: "+name1.endsWith("h"));
		System.out.println("Substring: "+name1.substring(6));
		System.out.println("Value of: "+String.valueOf(true));

	}

}
