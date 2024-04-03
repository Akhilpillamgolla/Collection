package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A {

	static void rev(String[] al) {
		Collections.reverse(Arrays.asList(al)); // Collection method
		System.out.println("\nReverse List is:" + "\t" + Arrays.asList(al)); // printing reverse array list
	}

	static void max(String[] ls) {
		String longestString = Collections.max(Arrays.asList(ls), // list
				Comparator.comparing(String::length)); // comparator
		System.out.println("\nLongest String is = " + longestString); // Largest String
		System.out.println("\nLength of Longest String is = " + longestString.length()); // Length of string
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] a = new String[6];
		System.out.println("Please enter 6 names");
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextLine(); // reading elements
		System.out.println("\nArray Elements are:");
		
		for (String k : a)         // FormalParameter : Expression 
			System.out.println("\n" + k); // printing the array loop
		System.out.println("\nOriginal List is:" + "\t" + Arrays.asList(a));// array -> List
		
		for (String str : a) {
			StringBuilder as = new StringBuilder(str);
			System.out.println("\n" + str + "\t" + "->" + "\t" + as.reverse()); // print main & reverse String
		}
		rev(a); // calling methods
		max(a);
		Set<String> set = new LinkedHashSet<String>(Arrays.asList(a));
		System.out.println("\nReversed List with duplicates removed: " + set); // printing updated reverse list
		sc.close(); // Close the SC to avoid the warning
	}

}
