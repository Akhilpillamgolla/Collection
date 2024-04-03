package sortInCollection;
import java.util.*;
public class SortUsingComparator implements Comparator<Integer> {    //custom sort 

	public int compare(Integer I1,Integer I2) {
		
		if(I1>I2) {             //ob1 comes before ob2
		 return -1;	
		}
		else if(I1<I2) {        //ob1 comes After ob2
			return +1;
		}
		else {                 // ob1 = ob2
			return 0;
		}
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

