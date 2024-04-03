package collectionTypesMetod;
import java.util.*;
public class Map {

	public static void main(String[] args) {

		HashSet<String> mnm = new HashSet<>();
		mnm.add("aki");
		mnm.add("Babu");
		mnm.add("Pillamgolla");
		mnm.add("Pillamgolla");   //duplicates are not allowed
		
	System.out.println(mnm);   // we don't have same order
	
//	System.out.println(mnm.getClass(2));   we don't have any index related methods 
	
	
	 TreeSet<String> nmn = new TreeSet<>();
	 nmn.add("12.1");
	 nmn.add("11.1");
	 nmn.add("12.1");     //duplicates not allowed 
	 nmn.add("13.2");     // data comes in sorted format 
	 System.out.println(nmn);    
	 nmn.addAll(mnm);   //add elements from other collections 
	 System.out.println(nmn);
	 
	 HashMap<String,Integer> courses= new HashMap<>();        // <Key,Value>
	 courses.put("ECE", 240);
	 courses.put("CSE", 345);
	 courses.put("EEE", 245);   //keys order is not maintained 
	 courses.put("EEE", 245);  //duplicates are not allowed  
	 
	 System.out.println(courses);
	 
	 courses.forEach((e1,e2)->{                     //lamda fun for key & value
		 System.out.println(e1+"=>"+e2);
	 });
	 
	 
	 System.out.println((courses.get("ECE")));   // to know exact fee of book
	}

}
 