package listTypes;

import java.util.ArrayList;

public class DuplicateRemoverListString {

	public static void main(String[] args) {
		String s ="aaaaaaaaaabbbbbbbbccccccddddddddddZZZZ";
		ArrayList<Character> list = new ArrayList<>();
		
		for (int i =0; i<s.length();i++) {   //
			char eachChar = s.charAt(i);    // i value is passed
			if(!list.contains(eachChar)) {  //!- negate
				list.add(eachChar);      //if char is not there then only it will print
				
			}
			
		}
		
		System.out.println(list);        // remove duplicates and print in list 
		
		String res = "";
		for (Character character : list) {
			res+=character;   //appending is done 
		}
		
		System.out.println(res);        // remove duplicates & Print in String
				

	}

}

