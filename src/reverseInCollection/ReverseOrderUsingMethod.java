package reverseInCollection;
import java.util.*;
public class ReverseOrderUsingMethod {
	
	// main driver method
    public static void main(String[] args)
    {
        // Let us create a list of strings
        List<String> mylist = new ArrayList<>();
  
        
        mylist.add("practice"); 
        mylist.add("code");                                     // Adding elements to the List
        mylist.add("quiz");                                                       // Custom input elements
        mylist.add("Akhil Pillamgolla");
        
  
                                                           
        System.out.println("Original List : " + mylist);         // Print all elements originally
  
                                                                 // Using reverse() method to
                                                                 // reverse the element order of my list
        Collections.reverse(mylist);
  
                                                                // Print all elements of list in reverse order  
                                                                // using reverse() method
        System.out.println("Modified List: " + mylist);
    }

}
