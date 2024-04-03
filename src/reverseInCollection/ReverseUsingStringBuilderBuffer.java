package reverseInCollection;

import java.util.ArrayList;

public class ReverseUsingStringBuilderBuffer {
	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<>();
		arr.add("aki");
		arr.add("Pillamgolla");
		arr.add("akhil");
		arr.add("babu");
		arr.add("smart");
		arr.add("Pillamgolla"); // duplicates are allowed

		// for each loop
		for (String str : arr) {                     //str is a variable   arr is also variable 
			System.out.println(str + "\t" + str.length() + "\t"); // tab space \t
			
			StringBuffer br = new StringBuffer(str); // 1st method
			System.out.println(br.reverse());

			StringBuilder kt = new StringBuilder(str); // 2nd method
			System.out.println(kt.reverse());

		}
	}
}