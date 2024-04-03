package listTypes;
import java.util.*;
public class VectorClass {

	public static void main(String[] args) {
		Vector v1 = new Vector(21);       //21 size of vector  (if we don't mention it will be 10 by default)
		
		v1.add("Pillamgolla");           // shifting is done in right side 
		v1.add("Babu");		             //prints in order if no index value is specified 
		v1.add("Pillamgolla");         //Duplication allowed 
		v1.add(0,"Akhil");                           // <--- 0 is index  
		System.out.println(v1);
		System.out.println("Size of vector: "+v1.size());          //if  size is increased more than 10 ,20 ,40,80  (41 also makes a huge diffrence)
		System.out.println("Capacity of vector: "+v1.capacity());  // Capacity will be double if size increases    

		Vector<String> v2 = new Vector<>();
		v2.addAll(v1);                 // we can also use for loop but  that is a lengthy procedure 
		System.out.println(v2);
		
		System.out.println(v1.get(0));   //retrieval of elements 
			
		System.out.println(v1.remove(1));   // deletion of element from array
		
		System.out.println(v1);
		
		System.out.println(v1.contains("Akhil"));    // verification 
		
		System.out.println(v1.containsAll(v2));       // cheking both have same elements or not // order is not a factor over here
	   
		v2.add("Smart");
		System.out.println(v1.containsAll(v2));       //if we have any other element apart from v1 then it returns false 
		
		v1.set(0,"aki");                          //List get updated  using index number 
		System.out.println(v1);
		
		
		System.out.println(v1.indexOf("Babu"));     //to find the index where element is present 
		
		System.out.println(v1.isEmpty());  // check weather list is empty or not
		
		System.out.println(v1.firstElement());      // No need to have any index  we will find last element in the list 

		System.out.println(v1.lastElement());      // No need to have any index  we will find last element in the list 
		
		
		
	}

	}
