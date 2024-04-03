package mapTypes;
import java.util.*;
import java.util.Map.Entry;

public class HashMapclass {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(125, "Burger"); // Adding of elements to map
		m.put(150, "Pizza");
		m.put(1456, "Family Pack");
		m.put(20, "water");

		Set<Integer> keys = m.keySet(); // Retrieval of data using keys

		for (Integer key : keys) {
			System.out.println(" The values of keys are :" + key);  // Print  all keys

		}

		Collection<String> values = m.values(); // to get all values
		
		for (String value : values) {
			System.out.println(" The elements that are  to be printed :" + value); //  Print value present 
		}
		
		for (Integer key : keys) { 
			System.out.println(key + "-" + m.get(key));  //print both values With key
		}

		System.out.println("Another Approch to give keys & Value " + m); // Alternative Method
		
		System.out.println(" Retriving values using method :  " + m.get(20));   // Retrieval is done using key
		
		
		System.out.println("Removed Element using Key : " + m.remove(20));   //remove using key 

		System.out.println("Remove using key and Value " + m.remove(125, "Burger"));   // remove using  Key & value 
		

		System.out.println("Verify Elements using key  "+m.containsKey(1456));   //check weather we have that element or not  using key 

		System.out.println(" Verify Elements using key " +m.containsValue("Family Pack")); // check  weather we have that element or not  using value

		System.out.println(" Replace Elements using key " + m.put(1456, "APPle")); // Replace  the data with number 

		System.out.println(" if key is not present then its add element "+m.putIfAbsent(1456, "PineApple")); // if the key is not present then only this will be added

		System.out.println(" Replace Elements using key " + m.replace(1456, "Biyani")); // Replace the data with String 
		

		System.out.println("Give the size "+m.size()); //getting the size 

		m.clear();                
		System.out.println(" Clear the data "+m);
	}	

}
