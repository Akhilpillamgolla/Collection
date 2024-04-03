package set;
import java.util.*;
public class LinkedHashSetClass {

	public static void main(String[] args) {
		Random rdm = new Random();
		
		LinkedHashSet<Integer> set = new LinkedHashSet();
		
		for(int i=1;i<=5;i++) {
			int number = rdm.nextInt(100);
			set.add(number);
			System.out.println(number);
			
		}
	System.out.println("LinkedHashSet is "+ set);  //This stores in same order that we had given
	}
}
