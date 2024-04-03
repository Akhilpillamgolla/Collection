package sortInCollection;

import java.util.TreeSet;

public class SortUsingTreeSetDecending {

public static void main(String[] args) {

	   TreeSet<Integer> arr = new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0);	
	 arr.add(10);
	  arr.add(20);
	  arr.add(30);
	  arr.add(40);
	  arr.add(50);
	  
	  System.out.println(" After Sorting :" +arr);
	  

	      
}
}
