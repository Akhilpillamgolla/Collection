package traversalCollection;
import java.util.*;
public class TravellingUsingIteratorStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();  
		stack.push("akhil");           //adding is done
		stack.push("Pillamgolla");  
		stack.push("Aki");  
		stack.push("babu");  
		stack.push("this will get deleted in stack");  
		stack.pop();                // deletion is done
		Iterator<String> itr=stack.iterator();              //Traversing list through Iterator  
		while(itr.hasNext()){                            //Loop  Same process for all the List but in linked list it can't  go in backward direction.
		System.out.println(itr.next());  
		}
	}

}
