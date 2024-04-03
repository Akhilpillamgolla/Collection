package sortInCollection;
import java.util.*;

public class SortUsingTreeSet {

public static void main(String[] args) {
	  ArrayList<Integer> arr = new ArrayList<>();

	  arr.add(50);
	  arr.add(40);
	  arr.add(30);
	  arr.add(20);
	  arr.add(10);
	  
	  
	  System.out.println("Before Sorting :" +arr);
	  

	   TreeSet<Integer> tr = new TreeSet<>();
	       tr.addAll(arr);
		  System.out.println("After Sorting :" +tr);

	 
}  
 
   
 
}
