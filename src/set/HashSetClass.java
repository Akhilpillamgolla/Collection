package set;

import java.util.*;

public class HashSetClass {

	public static void main(String[] args) {

		Random obj = new Random();       //this will have import java.random PKG  

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 10; i++) { // Generating 10 Random Numbers
			int number = obj.nextInt(5); // UpperBound is 5 (For duplicate List/Set)
			list.add(number);
		}

		System.out.println("List: " + list);
		
		Set<Integer> set = new HashSet<>(list); //list value can be sent here 
		System.out.println ("Set:"+set);

	}

}
 