package traversalCollection;
import java.util.*;
public class TraverseUsingForEachLoop {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<>();
		arr.add("aki");
		arr.add("Pillamgolla");
		arr.add("akhil");
		arr.add("babu");
		arr.add("smart");
		arr.add("Pillamgolla");      // duplicates are allowed 
		
		//for each loop 
		for (String str:arr)           // for each + ctrl + space
		{
		System.out.println(str + "\t"+str.length()+"\t");	  //  tab space \t
		StringBuffer br = new StringBuffer(str);
		System.out.println(br.reverse());
		
//		StringBuilder kt = new StringBuilder(str);
//		System.out.println(kt.reverse());
		
		}
		
	
	
	}
	

}
