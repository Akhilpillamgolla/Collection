package listTypes;
import java.util.*;
public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		
		names.add("akhil");
		names.add("Pillamgolla");
		names.add("SMART");
		names.add("akhil");
		names.add("akhil");
		
		

		
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.contains("akhil"));
		System.out.println(names.get(0));
		System.out.println(names.set(0, "aki"));
		System.out.println(names);
		System.out.println(names.isEmpty());
		System.out.println(names.remove(2));
		System.out.println(names);
		System.out.println(names.lastIndexOf(names));
		System.out.println(names.indexOf("akhil"));
		
		ArrayList <String> copy = new ArrayList<> ();    //we can also write List<String>  or collection<String>
        copy.addAll(names);
        System.out.println(copy);
        
       
        
		
		
		
		

	}

}
