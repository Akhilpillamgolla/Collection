package collectionTypesMetod;

import java.util.*; // * can be  any collection like array list , hash set 

public class Listmethod {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();

		a.add(100); // inserting an index
		a.add(200);
		a.add(300);

		System.out.println(a.get(0)); // we will get all the elements that are present in index

		System.out.println(a);

		int b = a.indexOf(300); // FINDING INDEX OF 300 IN LIST
		System.out.println(b);

		a.add(1, 700); // inserting at particular index
		System.out.println(a);

		a.set(1, 900); // changing index 1=700 to 900 value
		System.out.println(a);

		a.add(1, 500); // push 500 in index 1 & rest is pushed a side
		System.out.println(a);

		a.get(2); // used to get value
		System.out.println(a);

		System.out.println(a.size()); // gives size of array list
		
		a.remove(2); // removes using array index
		System.out.println(a);

		Vector<Integer> vector = new Vector<>();
		vector.addAll(a); // this will save all the values from previous collection to here

		boolean d = a.contains(400); // contains is used for checking in array list
		System.out.println(d);

		System.out.println(a.contains(100)); // a is calling collection integers type equals method

		System.out.println(a.isEmpty()); // check weather element is empty or not

		// clear() deletes every element from the collection and
		// removeAll() one only removes the elements matching those from another
		// Collection

//	    a.clear();
//	    System.out.println(a);

	}

}
