package generics;
import java.util.*;    //must for colln
public class Generics {                   //< > generics came in 1.5  version

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();    //left - parent || Right - Child 
	list.add("generics here means this list is going to deal with only string data");
	list.add("This Provide Type safe");
	list.add("We will know the data type in complile time only");
	list.add("Type casting issue will be resolved");
	
	List nongeneric = new ArrayList();
	nongeneric.add("nonTypeSafe");
	nongeneric.add("This allow any kind of data & no Restructions");
	nongeneric.add("Not Mostly used");
	
	
	//TYPE Erasure
	System.out.println("List<Integer> list = new ArrayList<>();");
	System.out.println("In the above code if we give String value we get Error");
	System.out.println("Type Erassure make sure that interger is removed to enable backward compactablility");
	
	
	}
	
}
