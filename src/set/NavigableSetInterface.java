package set;
import java.util.*;
public class NavigableSetInterface {           // 1.6 version

	public static void main(String[] args) {
		
		TreeSet<Integer> s = new TreeSet<>();
		
		s.add(50);
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		
		
		System.out.println("TreeSet elements : "+s);  // Sorted  order 
		
		System.out.println(s.ceiling(20));  //Returns the lowest element which is greater than  or equal to the value we are passing in(op 20&30)  
		
		System.out.println(s.higher(40));  //(O/P -specified element++)

		System.out.println(s.floor(10));   //(O/P <= 10)
		
		System.out.println(s.lower(30));  //O/P < SpecifiedValue)
		
		System.out.println(s.pollFirst()); // REmove first element
		
		System.out.println(s.pollLast()); //REmove Last Element
		
		System.out.println(s.descendingSet()); //Print in Descending order
		
		System.out.println(s);  //after any method applied we will get in order 
		
	}

}
