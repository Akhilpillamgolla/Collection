package collectionTypesMetod;
import java.util.*;         // must for collection   class importing 
public class list {

	public static void main(String[] args) {
		
		//type safe & un type safe are 2 type of  collection creation 
		
		//type safe 
		ArrayList<String> names=new ArrayList<>();  // we can use only string  data type 
		names.add("Akhil");  //Adding object in array list  
		names.add("Babu");
		names.add("Pillamgolla");
		names.add("Babu");// duplicates are allowed
//		names.add("123");   we get error if we add different data type
		System.out.println(names);          //print data in preserved order
		System.out.println(names.get(0));   // we will get all the elements that are present in index
		System.out.println(names.get(2));
		
		//un type safe
		LinkedList  list=new LinkedList();     // we can use any data type 
		list.add("akhil");
		list.add("123");
		list.add(456);
		list.add(true);
		System.out.println(list);
		
		Vector vec=new  Vector();
		vec.add("akhi");
		vec.add("123");
		vec.add(456);
		vec.add(true);
		System.out.println(vec);
		
		Stack sta=	new  Stack();
		sta.push("akhi");
		sta.push("123");
		sta.push(456);
		sta.push(true);
		sta.pop();         // true will be gone 
		System.out.println(sta);
		
		

		
	}
}


