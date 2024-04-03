package listTypes;
import java.util.*;
public class ListIteratorTraversal {
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>(); // LinkedList Traversal can happen in both direction as its DLL
		
		list.add("First - 1");
		list.add("Second - 2");
		list.add("Third - 3");
		
		ListIterator<String> itr = list.listIterator();
		
		System.out.println("Traversal in Forward Direction: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Traversal in Reverse Direction: ");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
	}

}
