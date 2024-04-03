package sortInCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingCollectionMethodShortCut implements Comparator<Integer> {    //custom sort 

	public int compare(Integer I1,Integer I2) {
		
		return(I1>I2)?-1:(I1<I2)?+1:0; // Ternary operation
	   // if (condition)? (check) return :
	}
	
	
public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(50);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		System.out.println("Before Sorting : " + arr);
         Collections.sort(arr,new SortUsingComparator());
         System.out.println("After Sorting : " + arr);      //Descending Order Sort
	}
}
