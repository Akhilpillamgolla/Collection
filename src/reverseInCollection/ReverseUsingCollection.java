package reverseInCollection;


import java.util.*;

class ReverseUsingCollection {

	
	static void rev(String[] al) {
		
		Collections.reverse(Arrays.asList(al));       //Collection method
		 
		System.out.println("\nReverse List is:");
		
		System.out.println(Arrays.asList(al));
		
		for(String str:al) {
			StringBuffer as = new StringBuffer(str);
			System.out.println(str);
			
			System.out.println(as.reverse());
		}
	}
	public static void main(String[] args) {
       String a[]={"mango","apple"};
		
       System.out.println(Arrays.asList(a));
       
       rev(a);
	}
}
