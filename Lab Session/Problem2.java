package LabSession;

/*Problem Statement 2:
1. Develop a java class with a instance variable Country HashSet (H1) add a method
storeCountryNames(String CountryName) , the method should add the passed country to
a HashSet (H1) and return the added HashSet(H1).
2. Develop a method retrieveCountry(String CountryName) which iterates through the
HashSet and returns the country if exist else return null.
NOTE: You can test the methods using a main method.*/

import java.util.HashSet;
import java.util.Iterator;

 class Country {
	HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> storeCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
}
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country countries = new Country();
		countries.storeCountryNames("India");
		countries.storeCountryNames("USA");
		countries.storeCountryNames("Pakistan");
		countries.storeCountryNames("Bangladesh");
		countries.storeCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		

	}

}
