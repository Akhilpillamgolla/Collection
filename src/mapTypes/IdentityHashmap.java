package mapTypes;
import java.util.*;
public class IdentityHashmap {

	public static void main(String[] args) {
	
		Map<Integer,String> map = new HashMap<>(); 
		
		Integer id1  = new Integer(10);
		Integer id2  = new Integer(10);
		
		map.put(id1,"Akhil");                   //id1 are pointing toward diffrent object but contents are same 
		map.put(id2, "Pillamgolla");            //(key,Value)
		
		System.out.println(map);           //use .equals method  (Compares reference value like 10)
		
		Map<Integer,String> nap = new IdentityHashMap<>();	
		Integer id3  = new Integer(10);
		Integer id4  = new Integer(10);
		
		map.put(id3,"Akhil");                   //id1 are pointing toward diffrent object but contents are same 
		map.put(id4, "Pillamgolla");            //(key,Value)
		
		System.out.println(nap);            // this stores both values for same key 
                                            // Uses == operation (Compare actual values Akhil Pillamgolla)
	}

}
