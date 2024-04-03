package userInputCollection;

import java.io.BufferedReader;                  //Console class
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class ParseintUsingTreeSet {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //
		
		System.out.println("How many elements you want to add to the array: ");
		
		int n = Integer.parseInt(in.readLine());    // n is max value to be attached 
		
		System.out.println("enter numbers : "); 
	
		TreeSet<String> set = new TreeSet<>();
		
		for (int i = 0; i < n; i++) {   // input value must be less than specified max value 
		    set.add(in.readLine());     //ReadLine () - if Size is not Specified reads data from console       
		}                               //Read () - if Size is  Specified 

		System.out.println(set);
		
		System.out.println(set);  // gives the same  output as above 
		
		System.out.println(set.size());
	}

}
