package listTypes;
import java.util.*;
public class LinkedListClass {

	public static void main(String[] args) {
    
		//Linked list implementation depends on object not on array 
		Queue<String> link = new  LinkedList<>();       //we can also write List<String> &   collection<String> & Iterable<String> but we can't perform Queues operation 
		link.add("Link 1");                             //but we mostly use queue ,deque 
		link.add("Link 2");                                       
		link.add("Link 3");     
//		link.add(0,"Link 0");   
		
		System.out.println(link);
//		System.out.println(link.remove());  //if we don't mention it will remove first element
//		System.out.println(link.get(1));
//		System.out.println(link.contains("Link 3"));
//		System.out.println(link.set(1,"Apple"));

//         for synchronization we use Collection.sychronizedList(link);
		
		
		
		
		
	}
}
