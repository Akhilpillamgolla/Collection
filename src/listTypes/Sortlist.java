package listTypes;
import java.util.*;

public class Sortlist {
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		
		l.add("Z");
		l.add("X");
		l.add("B");
		l.add("A");
		
		System.out.println("Before Sorting : " +l);
		
		Collections.sort(l);
		
		System.out.println("After Sorting : " +l);
	}

}
