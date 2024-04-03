package sortInCollection;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingLamda {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(50);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		System.out.println("Before Sorting : " + arr);
         
		 Collections.sort(arr,(I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0); // implement -> Ternary operation
		

         System.out.println("After Sorting : " + arr);   

         Collections.sort(arr,(I1,I2)->(I1>I2)?1:(I1<I2)?-1:0); // implement -> Ternary operation

         System.out.println("After Sorting : " + arr);
         
	}

}
