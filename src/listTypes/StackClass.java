package listTypes;

import java.util.*;

public class StackClass {

	public static void main(String[] args) {

		// Stack will follow LIFO
		Stack<String> Colour = new Stack<>();                    // we can also write Vector<String>   
		System.out.println("<--------Normal Way-------->");
		Colour.add("Yellow");
		Colour.add("RED");
		Colour.set(0, "Green");
		System.out.println(Colour.get(0));
		System.out.println(Colour);
		System.out.println(Colour.contains("White"));
		Colour.clear();
		System.out.println(Colour);

		System.out.println("<--------Stack Way-------->");

		Colour.push("RED");              //push & add are exactly same
		Colour.push("Yellow");
		Colour.push("Green");
		Colour.push("White");		
		System.out.println(Colour.peek());           //final element
		System.out.println(Colour);
		Colour.pop();                           //remove is similar 
		System.out.println(Colour);
        System.out.println(Colour.search("RED"));     //contains is similar but we don't have zero address
        System.out.println(Colour.indexOf("Green"));    //it check horizontal 
       
        System.out.println(Colour.empty());        //similar to is empty 
        
        
       
	}

}
