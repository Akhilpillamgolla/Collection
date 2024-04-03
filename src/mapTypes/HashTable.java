package mapTypes;
import java.util.*;
import java.util.Map.Entry;
public class HashTable {

	public static void main(String[] args) {
		 
		 Map<Integer,String >m = new Hashtable<>();   //<Key, data type that will be stored >
		  
		 m.put(125, "Burger");      // Adding of elements to map
		 m.put(150, "Pizza");
		 m.put(1456, "Family Pack");
		 m.put(20, "water");
		 
		 
		 Set<Integer> keys = m.keySet();     //Retrival of data using keys 
        
		for (Integer key : keys) {
        System.out.println(" The values of keys are :" +key);
         
		}
		
		Collection<String> values = m.values();        //to get  all values
	for (String value : values) {
		System.out.println(" The elements that are  to be printed :"+value); 
	}
	
	System.out.println(" Retriving values using method :  "+m.get(20));
	
	for (Integer  key : keys) {                       //printing the values 
		System.out.println(key+">>>>>"+m.get(key));	
	}
	
	System.out.println(m);   //can print like this also
	
	m.remove(20);
	System.out.println(m);
	
	m.remove(125, "Burger");
	System.out.println(m);
	
	m.containsKey(1456);
	
	m.containsValue("Family Pack");
	
	m.put(1456, "APple");
	System.out.println(m);
	
	m.putIfAbsent(1456, "PineApple");     // if the key is not present then only this will be added
	
	m.replace(1456, "Biyani");
	System.out.println(m);
	
	System.out.println(m.size());
	
	m.clear();
	System.out.println(m);
	
//	Set<Entry<Integer, String>> entries = m.entrySet();  // to print key & value simply  
//	for (Entry<Integer, String> entry : entries) {
//		Integer key = entry.getKey();
//		String value = entry.getValue();
//		System.out.println(key +">>>>>>>"+ value);
//	}

	
	}
	
}
