package traversalCollection;
import java.util.*;
public class TraversalUsingforeachMethod {

	public static void main(String[] args) {
     ArrayList<String> names = new ArrayList<>();
     names.add("Akhil");
     names.add("Pillamgolla");
     names.add("Babu");
     System.out.println(names);
     
     //for each method
     names.forEach(e->{                // e->{} is a lamda function, e is just a variable it can be any thing 
    	 System.out.println(e);
     });
	}

}
