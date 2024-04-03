package sortInCollection;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingCollectionsMethod {

	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(50);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		System.out.println("Before Sorting : " + arr);

		 Collections.sort(arr);    //Sort in (Lower -> Higher) order
		
		System.out.println("After Sorting : " + arr);
	}

}
	